# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-9924701f-d653-4cb6-8037-06bac3a10653` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-3399f7b2-6652-43d6-9163-d17b8ac88f8f` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-3fa98566-505c-439e-b6e3-da17178fc266` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-b6527604-67e1-461e-8af7-e103d9eac5f2` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 14 | `qa-58303dd0-0737-4e76-a0f4-3e360619253b` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-81cccbaa-f984-4c2c-b1e3-979b2d553e60` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0d53feb6-1cd5-4e41-a147-6e746db8dcbc` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-635a98cb-13d6-4c35-906d-0d5928f1ad19` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-87aa96d1-b9c7-4b67-8dac-54997792d82b` |
| 10 | `POST /v1/auth/token` | 401 | 90 | `qa-7b641b85-1986-4fa8-a5d9-0ea74abe8132` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9924701f-d653-4cb6-8037-06bac3a10653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9924701f-d653-4cb6-8037-06bac3a10653
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6239f8d781","displayName":"QA 8b6239f8d781","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9924701f-d653-4cb6-8037-06bac3a10653
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Location: /v1/accounts/qa-8b6239f8d781
X-Served-Region: eu
Content-Length: 181

{"id":"acc_221092ae-d9b5-4f6e-a5e1-8b2c978c1618","handle":"qa-8b6239f8d781","displayName":"QA 8b6239f8d781","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.239460222Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3399f7b2-6652-43d6-9163-d17b8ac88f8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3399f7b2-6652-43d6-9163-d17b8ac88f8f
Content-Type: application/json

--- request body ---
{"handle":"qa-78036685088d","displayName":"QA 78036685088d","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3399f7b2-6652-43d6-9163-d17b8ac88f8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Location: /v1/accounts/qa-78036685088d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e44e793-07bd-4b91-b335-d225fa50ab71","handle":"qa-78036685088d","displayName":"QA 78036685088d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.292818298Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3fa98566-505c-439e-b6e3-da17178fc266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fa98566-505c-439e-b6e3-da17178fc266
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6239f8d781","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fa98566-505c-439e-b6e3-da17178fc266
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_221092ae-d9b5-4f6e-a5e1-8b2c978c1618"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b6527604-67e1-461e-8af7-e103d9eac5f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6527604-67e1-461e-8af7-e103d9eac5f2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78036685088d","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6527604-67e1-461e-8af7-e103d9eac5f2
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
Location: /v1/conversations/cnv_67a741d0-3feb-413b-8dda-a63d344b9734
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_67a741d0-3feb-413b-8dda-a63d344b9734","subject":"Error contract","status":"open","region":"eu","participants":["qa-8b6239f8d781","qa-78036685088d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.389306504Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_67a741d0-3feb-413b-8dda-a63d344b9734/messages
correlation: qa-58303dd0-0737-4e76-a0f4-3e360619253b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58303dd0-0737-4e76-a0f4-3e360619253b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58303dd0-0737-4e76-a0f4-3e360619253b
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_67a741d0-3feb-413b-8dda-a63d344b9734/messages","correlationId":"qa-58303dd0-0737-4e76-a0f4-3e360619253b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-81cccbaa-f984-4c2c-b1e3-979b2d553e60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81cccbaa-f984-4c2c-b1e3-979b2d553e60
Content-Type: application/json

--- request body ---
{"handle":"qa-78036685088d","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-81cccbaa-f984-4c2c-b1e3-979b2d553e60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e44e793-07bd-4b91-b335-d225fa50ab71"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d53feb6-1cd5-4e41-a147-6e746db8dcbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d53feb6-1cd5-4e41-a147-6e746db8dcbc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d53feb6-1cd5-4e41-a147-6e746db8dcbc
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
correlation: qa-635a98cb-13d6-4c35-906d-0d5928f1ad19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-635a98cb-13d6-4c35-906d-0d5928f1ad19
Content-Type: application/json

--- request body ---
{"handle":"qa-78036685088d","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-635a98cb-13d6-4c35-906d-0d5928f1ad19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-635a98cb-13d6-4c35-906d-0d5928f1ad19"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87aa96d1-b9c7-4b67-8dac-54997792d82b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87aa96d1-b9c7-4b67-8dac-54997792d82b
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87aa96d1-b9c7-4b67-8dac-54997792d82b
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
correlation: qa-7b641b85-1986-4fa8-a5d9-0ea74abe8132

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b641b85-1986-4fa8-a5d9-0ea74abe8132
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6239f8d781","password":"****"}

--- response: 401 in 90 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b641b85-1986-4fa8-a5d9-0ea74abe8132
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b641b85-1986-4fa8-a5d9-0ea74abe8132"}
```
