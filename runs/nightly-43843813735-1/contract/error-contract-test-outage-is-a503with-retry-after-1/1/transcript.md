# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-9645ace0-2124-4bc5-91d0-61f12e34ff5a` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-bf58b0c6-a371-4fcd-ae2f-d83caa208726` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-575143fd-17f3-42b4-b2c7-aa2c8e37f631` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-8eaa208c-30dc-4fc4-9d47-8ca1ffb30fa5` |
| 5 | `POST /v1/accounts` | 503 | 14 | `qa-88015aa8-34e2-4307-bba0-f20d08247e76` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-120077b6-3f8b-4cd6-bb9a-0d33f0c1da88` |
| 7 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-07293aa8-15f1-4a94-af21-f8e1fe10fe8c` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-3d984fae-368c-438d-8840-5f0be0330dd8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-8bc5a7bb-5bb2-403a-b91f-00960338db6b` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-c28a8b45-2ac9-4d45-97bc-ab4acdeaabdc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9645ace0-2124-4bc5-91d0-61f12e34ff5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9645ace0-2124-4bc5-91d0-61f12e34ff5a
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9bcf5252e5","displayName":"QA fc9bcf5252e5","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-9645ace0-2124-4bc5-91d0-61f12e34ff5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-fc9bcf5252e5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7819397a-9b0e-40b8-adbd-d027cb311d6b","handle":"qa-fc9bcf5252e5","displayName":"QA fc9bcf5252e5","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.903832800Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bf58b0c6-a371-4fcd-ae2f-d83caa208726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf58b0c6-a371-4fcd-ae2f-d83caa208726
Content-Type: application/json

--- request body ---
{"handle":"qa-e38804c888e7","displayName":"QA e38804c888e7","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf58b0c6-a371-4fcd-ae2f-d83caa208726
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-e38804c888e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fbb99385-6601-47b0-996c-e57e15ef7093","handle":"qa-e38804c888e7","displayName":"QA e38804c888e7","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.935806118Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-575143fd-17f3-42b4-b2c7-aa2c8e37f631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-575143fd-17f3-42b4-b2c7-aa2c8e37f631
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9bcf5252e5","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-575143fd-17f3-42b4-b2c7-aa2c8e37f631
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7819397a-9b0e-40b8-adbd-d027cb311d6b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8eaa208c-30dc-4fc4-9d47-8ca1ffb30fa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eaa208c-30dc-4fc4-9d47-8ca1ffb30fa5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e38804c888e7","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8eaa208c-30dc-4fc4-9d47-8ca1ffb30fa5
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
Location: /v1/conversations/cnv_957f859f-666d-4b1b-a218-f2d50a90f99a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_957f859f-666d-4b1b-a218-f2d50a90f99a","subject":"Error contract","status":"open","region":"eu","participants":["qa-fc9bcf5252e5","qa-e38804c888e7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.005267661Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-88015aa8-34e2-4307-bba0-f20d08247e76

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bba6c978-7e95-4389-bf7a-84e0fbfccca0
X-Correlation-Id: qa-88015aa8-34e2-4307-bba0-f20d08247e76
Content-Type: application/json

--- request body ---
{"handle":"qa-8460d0db3e17","displayName":"QA 8460d0db3e17","password":"****","region":"eu"}

--- response: 503 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88015aa8-34e2-4307-bba0-f20d08247e76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-88015aa8-34e2-4307-bba0-f20d08247e76"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-120077b6-3f8b-4cd6-bb9a-0d33f0c1da88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-120077b6-3f8b-4cd6-bb9a-0d33f0c1da88
Content-Type: application/json

--- request body ---
{"handle":"qa-e38804c888e7","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-120077b6-3f8b-4cd6-bb9a-0d33f0c1da88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fbb99385-6601-47b0-996c-e57e15ef7093"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07293aa8-15f1-4a94-af21-f8e1fe10fe8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07293aa8-15f1-4a94-af21-f8e1fe10fe8c
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07293aa8-15f1-4a94-af21-f8e1fe10fe8c
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3d984fae-368c-438d-8840-5f0be0330dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d984fae-368c-438d-8840-5f0be0330dd8
Content-Type: application/json

--- request body ---
{"handle":"qa-e38804c888e7","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d984fae-368c-438d-8840-5f0be0330dd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d984fae-368c-438d-8840-5f0be0330dd8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8bc5a7bb-5bb2-403a-b91f-00960338db6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bc5a7bb-5bb2-403a-b91f-00960338db6b
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8bc5a7bb-5bb2-403a-b91f-00960338db6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c28a8b45-2ac9-4d45-97bc-ab4acdeaabdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28a8b45-2ac9-4d45-97bc-ab4acdeaabdc
Content-Type: application/json

--- request body ---
{"handle":"qa-fc9bcf5252e5","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c28a8b45-2ac9-4d45-97bc-ab4acdeaabdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c28a8b45-2ac9-4d45-97bc-ab4acdeaabdc"}
```
