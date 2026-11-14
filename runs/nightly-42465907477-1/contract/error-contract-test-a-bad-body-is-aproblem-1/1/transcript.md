# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-a4388473-1fc8-490a-afc5-23d954fd1334` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-f7c13906-1062-49fe-92e9-d53cff631dd0` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-2446cd92-2511-4583-915b-316549557027` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-b3447040-8cfb-4c52-b12a-09557e675e02` |
| 5 | `POST /v1/auth/token` | 415 | 42 | `qa-ffdde045-7c77-4abb-857c-24e35035f72e` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-7ac205f7-cd5b-45a2-92e1-8a0f0369a8b1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-1ce619fd-1a17-46e8-8f67-cb0abad97c94` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-abebe725-c3d9-42ee-8720-52723066fe65` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-8e50483e-e4d9-479e-850b-621f3d70759d` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-d99a5a82-a5b2-40d2-b4fe-7675b38af186` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4388473-1fc8-490a-afc5-23d954fd1334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4388473-1fc8-490a-afc5-23d954fd1334
Content-Type: application/json

--- request body ---
{"handle":"qa-cecc791cb961","displayName":"QA cecc791cb961","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4388473-1fc8-490a-afc5-23d954fd1334
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-cecc791cb961
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd62104e-9213-443d-9d97-e8c3cde9ccac","handle":"qa-cecc791cb961","displayName":"QA cecc791cb961","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.705936304Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f7c13906-1062-49fe-92e9-d53cff631dd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7c13906-1062-49fe-92e9-d53cff631dd0
Content-Type: application/json

--- request body ---
{"handle":"qa-fd9abe723979","displayName":"QA fd9abe723979","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7c13906-1062-49fe-92e9-d53cff631dd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Location: /v1/accounts/qa-fd9abe723979
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fba2468c-cd25-48ec-bbe4-5f0d0b10810a","handle":"qa-fd9abe723979","displayName":"QA fd9abe723979","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.761306669Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2446cd92-2511-4583-915b-316549557027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2446cd92-2511-4583-915b-316549557027
Content-Type: application/json

--- request body ---
{"handle":"qa-cecc791cb961","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2446cd92-2511-4583-915b-316549557027
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd62104e-9213-443d-9d97-e8c3cde9ccac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b3447040-8cfb-4c52-b12a-09557e675e02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3447040-8cfb-4c52-b12a-09557e675e02
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fd9abe723979","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3447040-8cfb-4c52-b12a-09557e675e02
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
Location: /v1/conversations/cnv_dcf5f470-b1a3-4e06-8e55-36a2ae52dcb9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dcf5f470-b1a3-4e06-8e55-36a2ae52dcb9","subject":"Error contract","status":"open","region":"eu","participants":["qa-cecc791cb961","qa-fd9abe723979"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.836339294Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ffdde045-7c77-4abb-857c-24e35035f72e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffdde045-7c77-4abb-857c-24e35035f72e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffdde045-7c77-4abb-857c-24e35035f72e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-ffdde045-7c77-4abb-857c-24e35035f72e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7ac205f7-cd5b-45a2-92e1-8a0f0369a8b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac205f7-cd5b-45a2-92e1-8a0f0369a8b1
Content-Type: application/json

--- request body ---
{"handle":"qa-fd9abe723979","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ac205f7-cd5b-45a2-92e1-8a0f0369a8b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fba2468c-cd25-48ec-bbe4-5f0d0b10810a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ce619fd-1a17-46e8-8f67-cb0abad97c94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ce619fd-1a17-46e8-8f67-cb0abad97c94
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ce619fd-1a17-46e8-8f67-cb0abad97c94
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
correlation: qa-abebe725-c3d9-42ee-8720-52723066fe65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abebe725-c3d9-42ee-8720-52723066fe65
Content-Type: application/json

--- request body ---
{"handle":"qa-fd9abe723979","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abebe725-c3d9-42ee-8720-52723066fe65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-abebe725-c3d9-42ee-8720-52723066fe65"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e50483e-e4d9-479e-850b-621f3d70759d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e50483e-e4d9-479e-850b-621f3d70759d
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e50483e-e4d9-479e-850b-621f3d70759d
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
correlation: qa-d99a5a82-a5b2-40d2-b4fe-7675b38af186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d99a5a82-a5b2-40d2-b4fe-7675b38af186
Content-Type: application/json

--- request body ---
{"handle":"qa-cecc791cb961","password":"****"}

--- response: 401 in 31 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d99a5a82-a5b2-40d2-b4fe-7675b38af186
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d99a5a82-a5b2-40d2-b4fe-7675b38af186"}
```
