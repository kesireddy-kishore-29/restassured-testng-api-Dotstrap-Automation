# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-51addd24-2197-421f-933a-2cac0f45a85c` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-538455d7-9c8e-44bd-b248-60816f8bfad2` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-f7083be0-4ddd-4ff8-8d2e-c79d28b173d8` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-50849e6a-eea5-4147-b813-8437d89c3d71` |
| 5 | `POST /v1/accounts` | 422 | 34 | `qa-2cef8f5c-3a61-4d97-9c09-0b77c75743fb` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-de8e2104-714b-4b8b-93be-a503864c08c0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9bd9554e-82bd-4818-8ddc-f84655918b05` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-9e9b783d-7459-45e8-be2e-dc93cfa485d7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-7a26ab1e-f8d2-419a-88de-457ea8960c88` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-52fefb67-1b9a-4a14-9096-a6a214ad087e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-51addd24-2197-421f-933a-2cac0f45a85c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51addd24-2197-421f-933a-2cac0f45a85c
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0a39151dbb","displayName":"QA 6b0a39151dbb","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-51addd24-2197-421f-933a-2cac0f45a85c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-6b0a39151dbb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_945c7d86-0362-4d09-9e01-5d718f93d5b2","handle":"qa-6b0a39151dbb","displayName":"QA 6b0a39151dbb","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.060600929Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-538455d7-9c8e-44bd-b248-60816f8bfad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-538455d7-9c8e-44bd-b248-60816f8bfad2
Content-Type: application/json

--- request body ---
{"handle":"qa-206282abe637","displayName":"QA 206282abe637","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-538455d7-9c8e-44bd-b248-60816f8bfad2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-206282abe637
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49b38843-a70b-4819-baad-f2e2869c0649","handle":"qa-206282abe637","displayName":"QA 206282abe637","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.104486315Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f7083be0-4ddd-4ff8-8d2e-c79d28b173d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7083be0-4ddd-4ff8-8d2e-c79d28b173d8
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0a39151dbb","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7083be0-4ddd-4ff8-8d2e-c79d28b173d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_945c7d86-0362-4d09-9e01-5d718f93d5b2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-50849e6a-eea5-4147-b813-8437d89c3d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50849e6a-eea5-4147-b813-8437d89c3d71
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-206282abe637","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-50849e6a-eea5-4147-b813-8437d89c3d71
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
Location: /v1/conversations/cnv_769a428b-d4ac-4283-af07-7fa36e2a5c1e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_769a428b-d4ac-4283-af07-7fa36e2a5c1e","subject":"Error contract","status":"open","region":"eu","participants":["qa-6b0a39151dbb","qa-206282abe637"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.208012003Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-2cef8f5c-3a61-4d97-9c09-0b77c75743fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cef8f5c-3a61-4d97-9c09-0b77c75743fb
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cef8f5c-3a61-4d97-9c09-0b77c75743fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2cef8f5c-3a61-4d97-9c09-0b77c75743fb","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-de8e2104-714b-4b8b-93be-a503864c08c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de8e2104-714b-4b8b-93be-a503864c08c0
Content-Type: application/json

--- request body ---
{"handle":"qa-206282abe637","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-de8e2104-714b-4b8b-93be-a503864c08c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49b38843-a70b-4819-baad-f2e2869c0649"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9bd9554e-82bd-4818-8ddc-f84655918b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bd9554e-82bd-4818-8ddc-f84655918b05
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9bd9554e-82bd-4818-8ddc-f84655918b05
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
correlation: qa-9e9b783d-7459-45e8-be2e-dc93cfa485d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e9b783d-7459-45e8-be2e-dc93cfa485d7
Content-Type: application/json

--- request body ---
{"handle":"qa-206282abe637","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e9b783d-7459-45e8-be2e-dc93cfa485d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e9b783d-7459-45e8-be2e-dc93cfa485d7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a26ab1e-f8d2-419a-88de-457ea8960c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a26ab1e-f8d2-419a-88de-457ea8960c88
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a26ab1e-f8d2-419a-88de-457ea8960c88
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
correlation: qa-52fefb67-1b9a-4a14-9096-a6a214ad087e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52fefb67-1b9a-4a14-9096-a6a214ad087e
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0a39151dbb","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52fefb67-1b9a-4a14-9096-a6a214ad087e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52fefb67-1b9a-4a14-9096-a6a214ad087e"}
```
