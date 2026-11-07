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
| 1 | `POST /v1/accounts` | 201 | 493 | `qa-a9475159-2c71-42cb-84be-74d784975732` |
| 2 | `POST /v1/accounts` | 409 | 23 | `qa-d4305faf-ce23-44af-b5cd-c84196980eb0` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-951f56a8-bf08-4581-a365-9df9f89a7ffa` |
| 4 | `DELETE /v1/accounts/me` | 204 | 69 | `qa-637231a6-1823-4518-97d5-835a5f6887f2` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-75a1d661-4881-475b-afa4-4ace6d0e2501` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9475159-2c71-42cb-84be-74d784975732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9475159-2c71-42cb-84be-74d784975732
Content-Type: application/json

--- request body ---
{"handle":"qa-e45b0dd97e9d","displayName":"QA e45b0dd97e9d","password":"****","region":"eu"}

--- response: 201 in 493 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9475159-2c71-42cb-84be-74d784975732
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-e45b0dd97e9d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3f72b81-9f40-4eb4-b3b6-a6c6da533344","handle":"qa-e45b0dd97e9d","displayName":"QA e45b0dd97e9d","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.348030146Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d4305faf-ce23-44af-b5cd-c84196980eb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4305faf-ce23-44af-b5cd-c84196980eb0
Content-Type: application/json

--- request body ---
{"handle":"qa-e45b0dd97e9d","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4305faf-ce23-44af-b5cd-c84196980eb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-e45b0dd97e9d' is in use.","instance":"/v1/accounts","correlationId":"qa-d4305faf-ce23-44af-b5cd-c84196980eb0"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-951f56a8-bf08-4581-a365-9df9f89a7ffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951f56a8-bf08-4581-a365-9df9f89a7ffa
Content-Type: application/json

--- request body ---
{"handle":"qa-e45b0dd97e9d","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-951f56a8-bf08-4581-a365-9df9f89a7ffa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3f72b81-9f40-4eb4-b3b6-a6c6da533344"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-637231a6-1823-4518-97d5-835a5f6887f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-637231a6-1823-4518-97d5-835a5f6887f2
Content-Type: application/json

--- response: 204 in 69 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-637231a6-1823-4518-97d5-835a5f6887f2
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
correlation: qa-75a1d661-4881-475b-afa4-4ace6d0e2501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a1d661-4881-475b-afa4-4ace6d0e2501
Content-Type: application/json

--- request body ---
{"handle":"qa-e45b0dd97e9d","password":"****"}

--- response: 401 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75a1d661-4881-475b-afa4-4ace6d0e2501
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75a1d661-4881-475b-afa4-4ace6d0e2501"}
```
