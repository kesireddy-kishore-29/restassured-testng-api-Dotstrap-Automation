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
| 1 | `POST /v1/accounts` | 201 | 296 | `qa-a03dc68e-c365-4f58-adb2-66dfcc3e0821` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-fdc1f62a-af67-4479-a36e-eae460f94518` |
| 3 | `GET /v1/accounts/me` | 503 | 69 | `qa-66fab462-363e-414b-b8f5-dfdcb4218a69` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-e11e94d1-b67e-477a-9f79-53f3c1bf8258` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-e18c5adf-c87f-4f06-9a84-c14f9b04069c` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-ca8b8d0c-4e3e-4424-922d-b63bb1120936` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a03dc68e-c365-4f58-adb2-66dfcc3e0821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a03dc68e-c365-4f58-adb2-66dfcc3e0821
Content-Type: application/json

--- request body ---
{"handle":"qa-92f42af25e0b","displayName":"QA 92f42af25e0b","password":"****","region":"eu"}

--- response: 201 in 296 ms ---
Date: Thu, 05 Nov 2026 09:37:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a03dc68e-c365-4f58-adb2-66dfcc3e0821
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
Location: /v1/accounts/qa-92f42af25e0b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cdaf1634-384a-4c9c-ab41-795ef07cdc43","handle":"qa-92f42af25e0b","displayName":"QA 92f42af25e0b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:42.681089421Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fdc1f62a-af67-4479-a36e-eae460f94518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdc1f62a-af67-4479-a36e-eae460f94518
Content-Type: application/json

--- request body ---
{"handle":"qa-92f42af25e0b","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 05 Nov 2026 09:37:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdc1f62a-af67-4479-a36e-eae460f94518
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cdaf1634-384a-4c9c-ab41-795ef07cdc43"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-66fab462-363e-414b-b8f5-dfdcb4218a69

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d0c7e9e8-d69c-4433-947f-0ff108b7a8d9
X-Correlation-Id: qa-66fab462-363e-414b-b8f5-dfdcb4218a69
Content-Type: application/json

--- response: 503 in 69 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66fab462-363e-414b-b8f5-dfdcb4218a69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-66fab462-363e-414b-b8f5-dfdcb4218a69"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e11e94d1-b67e-477a-9f79-53f3c1bf8258

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d0c7e9e8-d69c-4433-947f-0ff108b7a8d9
X-Correlation-Id: qa-e11e94d1-b67e-477a-9f79-53f3c1bf8258
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-e11e94d1-b67e-477a-9f79-53f3c1bf8258
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

{"id":"acc_cdaf1634-384a-4c9c-ab41-795ef07cdc43","handle":"qa-92f42af25e0b","displayName":"QA 92f42af25e0b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:42.681089421Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e18c5adf-c87f-4f06-9a84-c14f9b04069c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e18c5adf-c87f-4f06-9a84-c14f9b04069c
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e18c5adf-c87f-4f06-9a84-c14f9b04069c
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
correlation: qa-ca8b8d0c-4e3e-4424-922d-b63bb1120936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca8b8d0c-4e3e-4424-922d-b63bb1120936
Content-Type: application/json

--- request body ---
{"handle":"qa-92f42af25e0b","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca8b8d0c-4e3e-4424-922d-b63bb1120936
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca8b8d0c-4e3e-4424-922d-b63bb1120936"}
```
