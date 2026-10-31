# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 428 | `qa-d0a15d64-9e51-4bc3-a7dc-f255a7b74cef` |
| 2 | `POST /v1/auth/token` | 200 | 76 | `qa-efa78298-cf58-43e7-9a90-c03c1b0f8ab4` |
| 3 | `GET /v1/accounts/me` | 503 | 132 | `qa-70b8bf88-a476-4da8-b4ef-76c3c1124c4d` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-5bdad623-79a4-42a7-ac07-0786670f8487` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-a2b770f3-0865-4edd-a637-b788ccb5a0c5` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-b95448bc-7c15-4f2f-ba84-cc2fac771459` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0a15d64-9e51-4bc3-a7dc-f255a7b74cef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a15d64-9e51-4bc3-a7dc-f255a7b74cef
Content-Type: application/json

--- request body ---
{"handle":"qa-30582f76287a","displayName":"QA 30582f76287a","password":"****","region":"eu"}

--- response: 201 in 428 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0a15d64-9e51-4bc3-a7dc-f255a7b74cef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-30582f76287a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6b92a6b-0ccc-46d5-81c2-bf59caeb9682","handle":"qa-30582f76287a","displayName":"QA 30582f76287a","region":"eu","role":"user","createdAt":"2026-10-24T07:25:05.513193205Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-efa78298-cf58-43e7-9a90-c03c1b0f8ab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efa78298-cf58-43e7-9a90-c03c1b0f8ab4
Content-Type: application/json

--- request body ---
{"handle":"qa-30582f76287a","password":"****"}

--- response: 200 in 76 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-efa78298-cf58-43e7-9a90-c03c1b0f8ab4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6b92a6b-0ccc-46d5-81c2-bf59caeb9682"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-70b8bf88-a476-4da8-b4ef-76c3c1124c4d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 58e152b8-7046-4d30-84bf-32b5367d476b
X-Correlation-Id: qa-70b8bf88-a476-4da8-b4ef-76c3c1124c4d
Content-Type: application/json

--- response: 503 in 132 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70b8bf88-a476-4da8-b4ef-76c3c1124c4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-70b8bf88-a476-4da8-b4ef-76c3c1124c4d"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5bdad623-79a4-42a7-ac07-0786670f8487

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 58e152b8-7046-4d30-84bf-32b5367d476b
X-Correlation-Id: qa-5bdad623-79a4-42a7-ac07-0786670f8487
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bdad623-79a4-42a7-ac07-0786670f8487
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6b92a6b-0ccc-46d5-81c2-bf59caeb9682","handle":"qa-30582f76287a","displayName":"QA 30582f76287a","region":"eu","role":"user","createdAt":"2026-10-24T07:25:05.513193205Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2b770f3-0865-4edd-a637-b788ccb5a0c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2b770f3-0865-4edd-a637-b788ccb5a0c5
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2b770f3-0865-4edd-a637-b788ccb5a0c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b95448bc-7c15-4f2f-ba84-cc2fac771459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b95448bc-7c15-4f2f-ba84-cc2fac771459
Content-Type: application/json

--- request body ---
{"handle":"qa-30582f76287a","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b95448bc-7c15-4f2f-ba84-cc2fac771459
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b95448bc-7c15-4f2f-ba84-cc2fac771459"}
```
