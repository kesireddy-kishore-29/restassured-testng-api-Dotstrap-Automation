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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-73bac83b-ef77-4350-bb6c-3993f8058c5f` |
| 2 | `POST /v1/accounts` | 201 | 74 | `qa-1623205e-c7ef-457d-a4b5-747d7996dd3d` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-65ac49d0-8276-4c5a-a57d-981546d16c28` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-b2142ad6-cebd-4698-b53d-0e232d8136cc` |
| 5 | `POST /v1/accounts` | 422 | 17 | `qa-fda7fd54-72f7-449c-9e3b-962bf196fed9` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-48f050ce-a574-4cb4-9aeb-94c095269c4e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-61b5b1b6-1558-4a20-b323-9738921a0156` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-56111623-43e0-4cd8-b11d-a6316e4a3023` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-cdca5026-e7ce-4bb9-a867-591d729b0141` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-eb6b6971-1d43-412c-aecf-6e886f943728` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73bac83b-ef77-4350-bb6c-3993f8058c5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73bac83b-ef77-4350-bb6c-3993f8058c5f
Content-Type: application/json

--- request body ---
{"handle":"qa-652cffd93453","displayName":"QA 652cffd93453","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-73bac83b-ef77-4350-bb6c-3993f8058c5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-652cffd93453
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6292c842-abf7-45dd-8c74-c5fa78296d23","handle":"qa-652cffd93453","displayName":"QA 652cffd93453","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.379077661Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1623205e-c7ef-457d-a4b5-747d7996dd3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1623205e-c7ef-457d-a4b5-747d7996dd3d
Content-Type: application/json

--- request body ---
{"handle":"qa-d523ca1c2478","displayName":"QA d523ca1c2478","password":"****","region":"eu"}

--- response: 201 in 74 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1623205e-c7ef-457d-a4b5-747d7996dd3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-d523ca1c2478
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f0af6b26-618a-4e8b-a923-ce5674324f1e","handle":"qa-d523ca1c2478","displayName":"QA d523ca1c2478","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.437876184Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-65ac49d0-8276-4c5a-a57d-981546d16c28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65ac49d0-8276-4c5a-a57d-981546d16c28
Content-Type: application/json

--- request body ---
{"handle":"qa-652cffd93453","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-65ac49d0-8276-4c5a-a57d-981546d16c28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6292c842-abf7-45dd-8c74-c5fa78296d23"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b2142ad6-cebd-4698-b53d-0e232d8136cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2142ad6-cebd-4698-b53d-0e232d8136cc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d523ca1c2478","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2142ad6-cebd-4698-b53d-0e232d8136cc
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
Location: /v1/conversations/cnv_627951cd-3876-4955-8101-c129db781dcb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_627951cd-3876-4955-8101-c129db781dcb","subject":"Error contract","status":"open","region":"eu","participants":["qa-652cffd93453","qa-d523ca1c2478"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.546959019Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-fda7fd54-72f7-449c-9e3b-962bf196fed9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fda7fd54-72f7-449c-9e3b-962bf196fed9
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fda7fd54-72f7-449c-9e3b-962bf196fed9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-fda7fd54-72f7-449c-9e3b-962bf196fed9","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-48f050ce-a574-4cb4-9aeb-94c095269c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48f050ce-a574-4cb4-9aeb-94c095269c4e
Content-Type: application/json

--- request body ---
{"handle":"qa-d523ca1c2478","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-48f050ce-a574-4cb4-9aeb-94c095269c4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f0af6b26-618a-4e8b-a923-ce5674324f1e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61b5b1b6-1558-4a20-b323-9738921a0156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61b5b1b6-1558-4a20-b323-9738921a0156
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61b5b1b6-1558-4a20-b323-9738921a0156
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
correlation: qa-56111623-43e0-4cd8-b11d-a6316e4a3023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56111623-43e0-4cd8-b11d-a6316e4a3023
Content-Type: application/json

--- request body ---
{"handle":"qa-d523ca1c2478","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56111623-43e0-4cd8-b11d-a6316e4a3023
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56111623-43e0-4cd8-b11d-a6316e4a3023"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cdca5026-e7ce-4bb9-a867-591d729b0141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdca5026-e7ce-4bb9-a867-591d729b0141
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cdca5026-e7ce-4bb9-a867-591d729b0141
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
correlation: qa-eb6b6971-1d43-412c-aecf-6e886f943728

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb6b6971-1d43-412c-aecf-6e886f943728
Content-Type: application/json

--- request body ---
{"handle":"qa-652cffd93453","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb6b6971-1d43-412c-aecf-6e886f943728
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb6b6971-1d43-412c-aecf-6e886f943728"}
```
