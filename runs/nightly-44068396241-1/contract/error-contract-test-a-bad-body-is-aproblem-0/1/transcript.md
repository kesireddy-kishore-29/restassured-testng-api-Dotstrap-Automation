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
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-43d8f59f-3f68-480b-9af2-09ca02d1c28c` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-b997b12a-a0a0-49b4-b6d4-94b0706bf3b1` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-7eb8f5e8-587e-4010-898d-d46fa9ca0758` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-4314dbd4-0228-4914-bffe-456d216e3fd1` |
| 5 | `POST /v1/auth/token` | 400 | 15 | `qa-14d517d1-9adc-4255-b82f-9b0d22aab2a4` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-b48f5571-b225-4513-8bfc-45946e238980` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-af1bb9f3-c488-4902-a99f-551ff2c0ca3f` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-7e143033-8de8-464a-a390-44ccd32dc0fe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-67de96cf-7ef6-490d-9fdb-8c78f2539dd2` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-15ed79c9-952a-4c1b-b141-15fb0c018a79` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43d8f59f-3f68-480b-9af2-09ca02d1c28c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d8f59f-3f68-480b-9af2-09ca02d1c28c
Content-Type: application/json

--- request body ---
{"handle":"qa-1ed0203ee992","displayName":"QA 1ed0203ee992","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-43d8f59f-3f68-480b-9af2-09ca02d1c28c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-1ed0203ee992
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d714c5ed-41df-4289-ae5b-c8ccb7309d78","handle":"qa-1ed0203ee992","displayName":"QA 1ed0203ee992","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.632714089Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b997b12a-a0a0-49b4-b6d4-94b0706bf3b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b997b12a-a0a0-49b4-b6d4-94b0706bf3b1
Content-Type: application/json

--- request body ---
{"handle":"qa-45a43a3dbb85","displayName":"QA 45a43a3dbb85","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b997b12a-a0a0-49b4-b6d4-94b0706bf3b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Location: /v1/accounts/qa-45a43a3dbb85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8b6112b-9dea-42d6-bb8d-23b613ec590f","handle":"qa-45a43a3dbb85","displayName":"QA 45a43a3dbb85","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.685876465Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7eb8f5e8-587e-4010-898d-d46fa9ca0758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eb8f5e8-587e-4010-898d-d46fa9ca0758
Content-Type: application/json

--- request body ---
{"handle":"qa-1ed0203ee992","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eb8f5e8-587e-4010-898d-d46fa9ca0758
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d714c5ed-41df-4289-ae5b-c8ccb7309d78"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4314dbd4-0228-4914-bffe-456d216e3fd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4314dbd4-0228-4914-bffe-456d216e3fd1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-45a43a3dbb85","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-4314dbd4-0228-4914-bffe-456d216e3fd1
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
Location: /v1/conversations/cnv_0903d8c4-1314-4c88-8498-b6e7cc43a9f1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0903d8c4-1314-4c88-8498-b6e7cc43a9f1","subject":"Error contract","status":"open","region":"eu","participants":["qa-1ed0203ee992","qa-45a43a3dbb85"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.786299346Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-14d517d1-9adc-4255-b82f-9b0d22aab2a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d517d1-9adc-4255-b82f-9b0d22aab2a4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14d517d1-9adc-4255-b82f-9b0d22aab2a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-14d517d1-9adc-4255-b82f-9b0d22aab2a4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b48f5571-b225-4513-8bfc-45946e238980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b48f5571-b225-4513-8bfc-45946e238980
Content-Type: application/json

--- request body ---
{"handle":"qa-45a43a3dbb85","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-b48f5571-b225-4513-8bfc-45946e238980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8b6112b-9dea-42d6-bb8d-23b613ec590f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af1bb9f3-c488-4902-a99f-551ff2c0ca3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af1bb9f3-c488-4902-a99f-551ff2c0ca3f
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af1bb9f3-c488-4902-a99f-551ff2c0ca3f
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
correlation: qa-7e143033-8de8-464a-a390-44ccd32dc0fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e143033-8de8-464a-a390-44ccd32dc0fe
Content-Type: application/json

--- request body ---
{"handle":"qa-45a43a3dbb85","password":"****"}

--- response: 401 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e143033-8de8-464a-a390-44ccd32dc0fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e143033-8de8-464a-a390-44ccd32dc0fe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67de96cf-7ef6-490d-9fdb-8c78f2539dd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67de96cf-7ef6-490d-9fdb-8c78f2539dd2
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67de96cf-7ef6-490d-9fdb-8c78f2539dd2
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
correlation: qa-15ed79c9-952a-4c1b-b141-15fb0c018a79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ed79c9-952a-4c1b-b141-15fb0c018a79
Content-Type: application/json

--- request body ---
{"handle":"qa-1ed0203ee992","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15ed79c9-952a-4c1b-b141-15fb0c018a79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15ed79c9-952a-4c1b-b141-15fb0c018a79"}
```
