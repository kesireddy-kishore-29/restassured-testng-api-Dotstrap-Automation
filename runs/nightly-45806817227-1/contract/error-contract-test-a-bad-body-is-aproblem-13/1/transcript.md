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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-fb12cb28-5cd1-4d25-94f2-89687f90dc7d` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-079bf387-904e-4a49-94d5-2601d3f955a3` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-5607cc7d-8c22-46b9-b5cb-754feb341267` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-cd3febd6-3c63-403e-85d6-506567d798cc` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 14 | `qa-dc856461-72e3-4e32-a6bf-6e2c933f3b75` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-84596364-692e-4e9e-99b7-e179b6fda5e6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-39d731dd-e0b9-4458-ab4c-706fa34a3e92` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-c3e9499d-806d-496b-a900-f3417bf762eb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-a3095a57-ef2f-4ff8-997d-e39968fb0990` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-6630a2eb-c6c6-458b-b1f6-fd7cb1cea444` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fb12cb28-5cd1-4d25-94f2-89687f90dc7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb12cb28-5cd1-4d25-94f2-89687f90dc7d
Content-Type: application/json

--- request body ---
{"handle":"qa-4acd50780017","displayName":"QA 4acd50780017","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb12cb28-5cd1-4d25-94f2-89687f90dc7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Location: /v1/accounts/qa-4acd50780017
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b21e7e6-4aa8-4b5c-9352-af3f7da2c804","handle":"qa-4acd50780017","displayName":"QA 4acd50780017","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.476345213Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-079bf387-904e-4a49-94d5-2601d3f955a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-079bf387-904e-4a49-94d5-2601d3f955a3
Content-Type: application/json

--- request body ---
{"handle":"qa-782232deb0dc","displayName":"QA 782232deb0dc","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-079bf387-904e-4a49-94d5-2601d3f955a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Location: /v1/accounts/qa-782232deb0dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eacc49c6-dcab-423c-abad-13125df0ffc8","handle":"qa-782232deb0dc","displayName":"QA 782232deb0dc","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.522182256Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5607cc7d-8c22-46b9-b5cb-754feb341267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5607cc7d-8c22-46b9-b5cb-754feb341267
Content-Type: application/json

--- request body ---
{"handle":"qa-4acd50780017","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5607cc7d-8c22-46b9-b5cb-754feb341267
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b21e7e6-4aa8-4b5c-9352-af3f7da2c804"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cd3febd6-3c63-403e-85d6-506567d798cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd3febd6-3c63-403e-85d6-506567d798cc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-782232deb0dc","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd3febd6-3c63-403e-85d6-506567d798cc
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
Location: /v1/conversations/cnv_3ad8d8ee-089f-48a7-88b4-ca557c9f5a04
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3ad8d8ee-089f-48a7-88b4-ca557c9f5a04","subject":"Error contract","status":"open","region":"eu","participants":["qa-4acd50780017","qa-782232deb0dc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.601250987Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3ad8d8ee-089f-48a7-88b4-ca557c9f5a04/messages
correlation: qa-dc856461-72e3-4e32-a6bf-6e2c933f3b75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc856461-72e3-4e32-a6bf-6e2c933f3b75
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc856461-72e3-4e32-a6bf-6e2c933f3b75
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_3ad8d8ee-089f-48a7-88b4-ca557c9f5a04/messages","correlationId":"qa-dc856461-72e3-4e32-a6bf-6e2c933f3b75"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-84596364-692e-4e9e-99b7-e179b6fda5e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84596364-692e-4e9e-99b7-e179b6fda5e6
Content-Type: application/json

--- request body ---
{"handle":"qa-782232deb0dc","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-84596364-692e-4e9e-99b7-e179b6fda5e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eacc49c6-dcab-423c-abad-13125df0ffc8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-39d731dd-e0b9-4458-ab4c-706fa34a3e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39d731dd-e0b9-4458-ab4c-706fa34a3e92
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-39d731dd-e0b9-4458-ab4c-706fa34a3e92
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
correlation: qa-c3e9499d-806d-496b-a900-f3417bf762eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3e9499d-806d-496b-a900-f3417bf762eb
Content-Type: application/json

--- request body ---
{"handle":"qa-782232deb0dc","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3e9499d-806d-496b-a900-f3417bf762eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3e9499d-806d-496b-a900-f3417bf762eb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3095a57-ef2f-4ff8-997d-e39968fb0990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3095a57-ef2f-4ff8-997d-e39968fb0990
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3095a57-ef2f-4ff8-997d-e39968fb0990
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
correlation: qa-6630a2eb-c6c6-458b-b1f6-fd7cb1cea444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6630a2eb-c6c6-458b-b1f6-fd7cb1cea444
Content-Type: application/json

--- request body ---
{"handle":"qa-4acd50780017","password":"****"}

--- response: 401 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6630a2eb-c6c6-458b-b1f6-fd7cb1cea444
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6630a2eb-c6c6-458b-b1f6-fd7cb1cea444"}
```
