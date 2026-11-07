# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-1d90960f-72d2-4a60-b3e6-88c9534f495f` |
| 2 | `POST /v1/accounts` | 409 | 6 | `qa-4067d705-01eb-4760-bad0-1160e9d87391` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-8475bd8a-1ba6-417a-b878-87f268682f06` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a34a9f2d-87dc-4866-9a02-cb29c3002418` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-9a083c9b-a392-49b7-a1ea-e0a8b6681182` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d90960f-72d2-4a60-b3e6-88c9534f495f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d90960f-72d2-4a60-b3e6-88c9534f495f
Content-Type: application/json

--- request body ---
{"handle":"qa-ae4f15377ec3","displayName":"QA ae4f15377ec3","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d90960f-72d2-4a60-b3e6-88c9534f495f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Location: /v1/accounts/qa-ae4f15377ec3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50a9d3e6-bf03-469b-92fc-6e19e6c7e201","handle":"qa-ae4f15377ec3","displayName":"QA ae4f15377ec3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.507425406Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4067d705-01eb-4760-bad0-1160e9d87391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4067d705-01eb-4760-bad0-1160e9d87391
Content-Type: application/json

--- request body ---
{"handle":"qa-ae4f15377ec3","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4067d705-01eb-4760-bad0-1160e9d87391
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-ae4f15377ec3' is in use.","instance":"/v1/accounts","correlationId":"qa-4067d705-01eb-4760-bad0-1160e9d87391"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8475bd8a-1ba6-417a-b878-87f268682f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8475bd8a-1ba6-417a-b878-87f268682f06
Content-Type: application/json

--- request body ---
{"handle":"qa-ae4f15377ec3","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8475bd8a-1ba6-417a-b878-87f268682f06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50a9d3e6-bf03-469b-92fc-6e19e6c7e201"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a34a9f2d-87dc-4866-9a02-cb29c3002418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a34a9f2d-87dc-4866-9a02-cb29c3002418
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a34a9f2d-87dc-4866-9a02-cb29c3002418
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9a083c9b-a392-49b7-a1ea-e0a8b6681182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a083c9b-a392-49b7-a1ea-e0a8b6681182
Content-Type: application/json

--- request body ---
{"handle":"qa-ae4f15377ec3","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a083c9b-a392-49b7-a1ea-e0a8b6681182
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a083c9b-a392-49b7-a1ea-e0a8b6681182"}
```
