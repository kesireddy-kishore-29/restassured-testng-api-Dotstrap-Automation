# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-2bf15190-d971-4c50-bd21-61b5922ff6d6` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-a6d10599-e039-429a-bfab-6f13a4e011b5` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-1333c3dc-75a6-4f41-ae9b-c568858b9db5` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-aee5f21a-15b0-472c-b4bd-edb13dfaa085` |
| 5 | `PATCH /v1/accounts/me` | 422 | 9 | `qa-9f14e7ee-c42d-4ca0-ac25-faa091ff3900` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-259cde73-6e54-450a-b691-8d7830aa71a7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-143427c5-53c7-4b76-8558-dbd8850dfbb8` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-1ddc7c77-486e-430b-a6ff-6499bfb385bf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-5f75438e-ae9f-4c95-a503-6d1f3b13a46b` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-fa4601b6-2a18-4b0d-a3dc-12a7eda3df91` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2bf15190-d971-4c50-bd21-61b5922ff6d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bf15190-d971-4c50-bd21-61b5922ff6d6
Content-Type: application/json

--- request body ---
{"handle":"qa-7f5ceb98179d","displayName":"QA 7f5ceb98179d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bf15190-d971-4c50-bd21-61b5922ff6d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 9
Location: /v1/accounts/qa-7f5ceb98179d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dbeb3912-47a5-4d73-8668-3436212c3267","handle":"qa-7f5ceb98179d","displayName":"QA 7f5ceb98179d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.955223426Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a6d10599-e039-429a-bfab-6f13a4e011b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d10599-e039-429a-bfab-6f13a4e011b5
Content-Type: application/json

--- request body ---
{"handle":"qa-a64768332838","displayName":"QA a64768332838","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6d10599-e039-429a-bfab-6f13a4e011b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-a64768332838
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dbf2e161-e772-4c4f-8293-9bb808a98171","handle":"qa-a64768332838","displayName":"QA a64768332838","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.984355035Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1333c3dc-75a6-4f41-ae9b-c568858b9db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1333c3dc-75a6-4f41-ae9b-c568858b9db5
Content-Type: application/json

--- request body ---
{"handle":"qa-7f5ceb98179d","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1333c3dc-75a6-4f41-ae9b-c568858b9db5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbeb3912-47a5-4d73-8668-3436212c3267"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aee5f21a-15b0-472c-b4bd-edb13dfaa085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aee5f21a-15b0-472c-b4bd-edb13dfaa085
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a64768332838","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-aee5f21a-15b0-472c-b4bd-edb13dfaa085
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
Location: /v1/conversations/cnv_fc830abd-8747-4d44-9515-0d625b936acd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fc830abd-8747-4d44-9515-0d625b936acd","subject":"Error contract","status":"open","region":"eu","participants":["qa-7f5ceb98179d","qa-a64768332838"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.032461127Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-9f14e7ee-c42d-4ca0-ac25-faa091ff3900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f14e7ee-c42d-4ca0-ac25-faa091ff3900
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f14e7ee-c42d-4ca0-ac25-faa091ff3900
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-9f14e7ee-c42d-4ca0-ac25-faa091ff3900","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-259cde73-6e54-450a-b691-8d7830aa71a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-259cde73-6e54-450a-b691-8d7830aa71a7
Content-Type: application/json

--- request body ---
{"handle":"qa-a64768332838","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-259cde73-6e54-450a-b691-8d7830aa71a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbf2e161-e772-4c4f-8293-9bb808a98171"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-143427c5-53c7-4b76-8558-dbd8850dfbb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-143427c5-53c7-4b76-8558-dbd8850dfbb8
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-143427c5-53c7-4b76-8558-dbd8850dfbb8
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
correlation: qa-1ddc7c77-486e-430b-a6ff-6499bfb385bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ddc7c77-486e-430b-a6ff-6499bfb385bf
Content-Type: application/json

--- request body ---
{"handle":"qa-a64768332838","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ddc7c77-486e-430b-a6ff-6499bfb385bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ddc7c77-486e-430b-a6ff-6499bfb385bf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f75438e-ae9f-4c95-a503-6d1f3b13a46b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f75438e-ae9f-4c95-a503-6d1f3b13a46b
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f75438e-ae9f-4c95-a503-6d1f3b13a46b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-fa4601b6-2a18-4b0d-a3dc-12a7eda3df91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4601b6-2a18-4b0d-a3dc-12a7eda3df91
Content-Type: application/json

--- request body ---
{"handle":"qa-7f5ceb98179d","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa4601b6-2a18-4b0d-a3dc-12a7eda3df91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa4601b6-2a18-4b0d-a3dc-12a7eda3df91"}
```
