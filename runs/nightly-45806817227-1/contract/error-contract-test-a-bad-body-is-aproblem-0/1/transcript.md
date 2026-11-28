# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-21bab207-3386-47b1-94f6-5df50da779a8` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-fad2510d-f893-422e-8205-ed8fb648b004` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-fd1a3bdd-8384-44d5-bfaf-f56e661a1075` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-af9f4a7b-3504-40b3-9d5c-104c48144f53` |
| 5 | `POST /v1/auth/token` | 400 | 11 | `qa-2a8e306e-33e4-4833-a706-2d973582a229` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-5eee7e7c-19a7-4398-ac0d-2e955029bb28` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-c314ff78-695b-4ba1-817b-b00f4e985468` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-928438ec-3f98-4578-b34c-f0b33f074287` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-38185620-30a0-4f42-9d07-4248a6a873af` |
| 10 | `POST /v1/auth/token` | 401 | 34 | `qa-2270ea02-9b99-4acb-8b92-7207f04ff173` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-21bab207-3386-47b1-94f6-5df50da779a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21bab207-3386-47b1-94f6-5df50da779a8
Content-Type: application/json

--- request body ---
{"handle":"qa-6750363af050","displayName":"QA 6750363af050","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-21bab207-3386-47b1-94f6-5df50da779a8
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
Location: /v1/accounts/qa-6750363af050
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e738da6-29fe-4642-9944-2d00562323fb","handle":"qa-6750363af050","displayName":"QA 6750363af050","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.500818645Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fad2510d-f893-422e-8205-ed8fb648b004

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fad2510d-f893-422e-8205-ed8fb648b004
Content-Type: application/json

--- request body ---
{"handle":"qa-1d563eef615d","displayName":"QA 1d563eef615d","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fad2510d-f893-422e-8205-ed8fb648b004
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-1d563eef615d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d9fbc185-d827-4f61-88a4-3a1e51da2ec1","handle":"qa-1d563eef615d","displayName":"QA 1d563eef615d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.557596714Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd1a3bdd-8384-44d5-bfaf-f56e661a1075

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd1a3bdd-8384-44d5-bfaf-f56e661a1075
Content-Type: application/json

--- request body ---
{"handle":"qa-6750363af050","password":"****"}

--- response: 200 in 56 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd1a3bdd-8384-44d5-bfaf-f56e661a1075
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e738da6-29fe-4642-9944-2d00562323fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-af9f4a7b-3504-40b3-9d5c-104c48144f53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af9f4a7b-3504-40b3-9d5c-104c48144f53
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1d563eef615d","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-af9f4a7b-3504-40b3-9d5c-104c48144f53
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
Location: /v1/conversations/cnv_c41b0db2-e269-4b72-92d4-0f01e166d659
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c41b0db2-e269-4b72-92d4-0f01e166d659","subject":"Error contract","status":"open","region":"eu","participants":["qa-6750363af050","qa-1d563eef615d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.727727731Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2a8e306e-33e4-4833-a706-2d973582a229

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a8e306e-33e4-4833-a706-2d973582a229
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a8e306e-33e4-4833-a706-2d973582a229
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-2a8e306e-33e4-4833-a706-2d973582a229"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5eee7e7c-19a7-4398-ac0d-2e955029bb28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eee7e7c-19a7-4398-ac0d-2e955029bb28
Content-Type: application/json

--- request body ---
{"handle":"qa-1d563eef615d","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-5eee7e7c-19a7-4398-ac0d-2e955029bb28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d9fbc185-d827-4f61-88a4-3a1e51da2ec1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c314ff78-695b-4ba1-817b-b00f4e985468

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c314ff78-695b-4ba1-817b-b00f4e985468
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c314ff78-695b-4ba1-817b-b00f4e985468
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
correlation: qa-928438ec-3f98-4578-b34c-f0b33f074287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-928438ec-3f98-4578-b34c-f0b33f074287
Content-Type: application/json

--- request body ---
{"handle":"qa-1d563eef615d","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-928438ec-3f98-4578-b34c-f0b33f074287
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-928438ec-3f98-4578-b34c-f0b33f074287"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38185620-30a0-4f42-9d07-4248a6a873af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38185620-30a0-4f42-9d07-4248a6a873af
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38185620-30a0-4f42-9d07-4248a6a873af
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
correlation: qa-2270ea02-9b99-4acb-8b92-7207f04ff173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2270ea02-9b99-4acb-8b92-7207f04ff173
Content-Type: application/json

--- request body ---
{"handle":"qa-6750363af050","password":"****"}

--- response: 401 in 34 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2270ea02-9b99-4acb-8b92-7207f04ff173
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2270ea02-9b99-4acb-8b92-7207f04ff173"}
```
