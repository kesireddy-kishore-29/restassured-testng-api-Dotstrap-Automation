# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-81cc4e76-3219-461e-906e-b83b0d0333f1` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-5639c2a1-ed68-46f2-8f61-be442e08564b` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-8db14acd-2e58-4bb3-acc8-56e1b88ec980` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-4e9d9a9b-7d48-4025-95fc-d33b87390fc9` |
| 5 | `POST /v1/auth/token` | 422 | 43 | `qa-185bba29-bafa-4c44-9e1a-472f895a0780` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-a29ad389-bad7-4e25-81f9-236930ceef46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-3f452ca5-0057-4cd1-a3f7-ec8a67e39cb3` |
| 8 | `POST /v1/auth/token` | 401 | 46 | `qa-e1af7066-3877-44cc-aac7-1e834d76a994` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-cea98ddc-71da-44f0-8d31-5020d111f9e6` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-3bc9416d-1fb5-4a1b-aa2b-7d436ae76566` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81cc4e76-3219-461e-906e-b83b0d0333f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81cc4e76-3219-461e-906e-b83b0d0333f1
Content-Type: application/json

--- request body ---
{"handle":"qa-356267001708","displayName":"QA 356267001708","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-81cc4e76-3219-461e-906e-b83b0d0333f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-356267001708
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6aa7cf9f-fde7-4ed2-ab92-2edc614877b3","handle":"qa-356267001708","displayName":"QA 356267001708","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.709986660Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5639c2a1-ed68-46f2-8f61-be442e08564b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5639c2a1-ed68-46f2-8f61-be442e08564b
Content-Type: application/json

--- request body ---
{"handle":"qa-c42f4fe03b1d","displayName":"QA c42f4fe03b1d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5639c2a1-ed68-46f2-8f61-be442e08564b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-c42f4fe03b1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cab4883-76fe-4780-826c-e06209440fe7","handle":"qa-c42f4fe03b1d","displayName":"QA c42f4fe03b1d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.753169241Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8db14acd-2e58-4bb3-acc8-56e1b88ec980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db14acd-2e58-4bb3-acc8-56e1b88ec980
Content-Type: application/json

--- request body ---
{"handle":"qa-356267001708","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8db14acd-2e58-4bb3-acc8-56e1b88ec980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6aa7cf9f-fde7-4ed2-ab92-2edc614877b3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4e9d9a9b-7d48-4025-95fc-d33b87390fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e9d9a9b-7d48-4025-95fc-d33b87390fc9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c42f4fe03b1d","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e9d9a9b-7d48-4025-95fc-d33b87390fc9
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
Location: /v1/conversations/cnv_abcd2252-518c-4216-85fc-6a99d794566f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_abcd2252-518c-4216-85fc-6a99d794566f","subject":"Error contract","status":"open","region":"eu","participants":["qa-356267001708","qa-c42f4fe03b1d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.832994964Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-185bba29-bafa-4c44-9e1a-472f895a0780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-185bba29-bafa-4c44-9e1a-472f895a0780
Content-Type: application/json

--- request body ---
{"handle":"qa-356267001708","password":"****","ttlSeconds":0}

--- response: 422 in 43 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-185bba29-bafa-4c44-9e1a-472f895a0780
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-185bba29-bafa-4c44-9e1a-472f895a0780","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a29ad389-bad7-4e25-81f9-236930ceef46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a29ad389-bad7-4e25-81f9-236930ceef46
Content-Type: application/json

--- request body ---
{"handle":"qa-c42f4fe03b1d","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a29ad389-bad7-4e25-81f9-236930ceef46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cab4883-76fe-4780-826c-e06209440fe7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f452ca5-0057-4cd1-a3f7-ec8a67e39cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f452ca5-0057-4cd1-a3f7-ec8a67e39cb3
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f452ca5-0057-4cd1-a3f7-ec8a67e39cb3
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
correlation: qa-e1af7066-3877-44cc-aac7-1e834d76a994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1af7066-3877-44cc-aac7-1e834d76a994
Content-Type: application/json

--- request body ---
{"handle":"qa-c42f4fe03b1d","password":"****"}

--- response: 401 in 46 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1af7066-3877-44cc-aac7-1e834d76a994
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1af7066-3877-44cc-aac7-1e834d76a994"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cea98ddc-71da-44f0-8d31-5020d111f9e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea98ddc-71da-44f0-8d31-5020d111f9e6
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cea98ddc-71da-44f0-8d31-5020d111f9e6
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3bc9416d-1fb5-4a1b-aa2b-7d436ae76566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bc9416d-1fb5-4a1b-aa2b-7d436ae76566
Content-Type: application/json

--- request body ---
{"handle":"qa-356267001708","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bc9416d-1fb5-4a1b-aa2b-7d436ae76566
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3bc9416d-1fb5-4a1b-aa2b-7d436ae76566"}
```
