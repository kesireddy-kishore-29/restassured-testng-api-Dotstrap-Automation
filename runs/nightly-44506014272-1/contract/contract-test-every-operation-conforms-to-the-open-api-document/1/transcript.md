# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 491 | `qa-b964396c-40a1-4b26-aa70-f8654994fd84` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-001369b7-d91e-4935-bcd9-fe855ae866af` |
| 3 | `GET /health` | 200 | 37 | `qa-e5618b26-1d7b-49ed-8492-9bfc39690e8f` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-7205466c-ee90-43cb-a377-562eeae03be0` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-0563400d-702d-4cfb-b376-aa18e87f1481` |
| 6 | `PATCH /v1/accounts/me` | 200 | 21 | `qa-458edb96-0b1f-4677-ba22-7d3cb66bce89` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 27 | `qa-532d5941-3468-4b22-9752-c2c7b346b26f` |
| 8 | `POST /v1/conversations` | 201 | 15 | `qa-a70d8570-1fa1-4a1f-b136-325eaa217936` |
| 9 | `GET /v1/conversations` | 200 | 15 | `qa-5610b337-320d-4267-bee1-283ff769b39b` |
| 10 | `POST /v1/auth/token` | 200 | 29 | `qa-bcbd6cbe-cb5a-420e-b175-0d912a910b4e` |
| 11 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-cd79f5e2-f1fe-42ac-9eb6-654133914e50` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-f57cd7c4-1c82-4790-9412-e5d8d2031cda` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-9efbc2b0-7d80-46fc-8607-5636299c3094` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 27 | `qa-67130507-d2dc-4fd1-b2ae-e6afa9594f90` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 12 | `qa-242db27f-3488-43fc-9a0b-726cfe754656` |
| 16 | `GET /v1/credits/balance` | 200 | 10 | `qa-85f00e4a-a4c6-457e-9af9-d86d96ed044d` |
| 17 | `GET /v1/credits/ledger` | 200 | 14 | `qa-87d137c6-a427-4c2a-89e4-33f253cf1b0d` |
| 18 | `POST /v1/credits/purchases` | 201 | 15 | `qa-6e3b0972-afff-4f8c-80fa-ecacbf97a6b5` |
| 19 | `GET /v1/admin/stats` | 403 | 15 | `qa-172670f7-e4be-4bf0-b14f-f51599e6e4a8` |
| 20 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-05be94e1-0ba1-4bf1-84bd-b7f037248481` |
| 21 | `POST /v1/auth/token` | 401 | 20 | `qa-550ac57d-6d1a-40c0-b412-8ffae58f290e` |
| 22 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-1451ca63-8282-4524-ac19-7d53fb5be0f0` |
| 23 | `POST /v1/auth/token` | 401 | 25 | `qa-e2d9c169-ef9e-40b0-aab1-93159cd1c682` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b964396c-40a1-4b26-aa70-f8654994fd84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b964396c-40a1-4b26-aa70-f8654994fd84
Content-Type: application/json

--- request body ---
{"handle":"qa-5b643413e24e","displayName":"QA 5b643413e24e","password":"****","region":"eu"}

--- response: 201 in 491 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-b964396c-40a1-4b26-aa70-f8654994fd84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-5b643413e24e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be8e83f5-5040-4f0d-a4f6-ffd24d30f464","handle":"qa-5b643413e24e","displayName":"QA 5b643413e24e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:22.319808972Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-001369b7-d91e-4935-bcd9-fe855ae866af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-001369b7-d91e-4935-bcd9-fe855ae866af
Content-Type: application/json

--- request body ---
{"handle":"qa-f3021aca4405","displayName":"QA f3021aca4405","password":"****","region":"us"}

--- response: 201 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-001369b7-d91e-4935-bcd9-fe855ae866af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-f3021aca4405
X-Served-Region: us
Content-Length: 181

{"id":"acc_b3331643-5ccd-45f6-b0b5-7c5fa51be9b6","handle":"qa-f3021aca4405","displayName":"QA f3021aca4405","region":"us","role":"user","createdAt":"2026-11-19T10:29:22.849807849Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-e5618b26-1d7b-49ed-8492-9bfc39690e8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5618b26-1d7b-49ed-8492-9bfc39690e8f
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5618b26-1d7b-49ed-8492-9bfc39690e8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7205466c-ee90-43cb-a377-562eeae03be0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7205466c-ee90-43cb-a377-562eeae03be0
Content-Type: application/json

--- request body ---
{"handle":"qa-5b643413e24e","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7205466c-ee90-43cb-a377-562eeae03be0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be8e83f5-5040-4f0d-a4f6-ffd24d30f464"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-0563400d-702d-4cfb-b376-aa18e87f1481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0563400d-702d-4cfb-b376-aa18e87f1481
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0563400d-702d-4cfb-b376-aa18e87f1481
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
Content-Length: 181

{"id":"acc_be8e83f5-5040-4f0d-a4f6-ffd24d30f464","handle":"qa-5b643413e24e","displayName":"QA 5b643413e24e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:22.319808972Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-458edb96-0b1f-4677-ba22-7d3cb66bce89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-458edb96-0b1f-4677-ba22-7d3cb66bce89
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-458edb96-0b1f-4677-ba22-7d3cb66bce89
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
Content-Length: 178

{"id":"acc_be8e83f5-5040-4f0d-a4f6-ffd24d30f464","handle":"qa-5b643413e24e","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-19T10:29:22.319808972Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-f3021aca4405
correlation: qa-532d5941-3468-4b22-9752-c2c7b346b26f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-532d5941-3468-4b22-9752-c2c7b346b26f
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-532d5941-3468-4b22-9752-c2c7b346b26f
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
Content-Length: 74

{"handle":"qa-f3021aca4405","displayName":"QA f3021aca4405","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-a70d8570-1fa1-4a1f-b136-325eaa217936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a70d8570-1fa1-4a1f-b136-325eaa217936
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f3021aca4405","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a70d8570-1fa1-4a1f-b136-325eaa217936
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27
X-Data-Region: us
Content-Length: 238

{"id":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5b643413e24e","qa-f3021aca4405"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.143606517Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-5610b337-320d-4267-bee1-283ff769b39b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5610b337-320d-4267-bee1-283ff769b39b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5610b337-320d-4267-bee1-283ff769b39b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5b643413e24e","qa-f3021aca4405"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.143606517Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bcbd6cbe-cb5a-420e-b175-0d912a910b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcbd6cbe-cb5a-420e-b175-0d912a910b4e
Content-Type: application/json

--- request body ---
{"handle":"qa-f3021aca4405","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcbd6cbe-cb5a-420e-b175-0d912a910b4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3331643-5ccd-45f6-b0b5-7c5fa51be9b6"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27
correlation: qa-cd79f5e2-f1fe-42ac-9eb6-654133914e50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd79f5e2-f1fe-42ac-9eb6-654133914e50
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd79f5e2-f1fe-42ac-9eb6-654133914e50
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5b643413e24e","qa-f3021aca4405"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-19T10:29:23.143606517Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27/messages
correlation: qa-f57cd7c4-1c82-4790-9412-e5d8d2031cda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f57cd7c4-1c82-4790-9412-e5d8d2031cda
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f57cd7c4-1c82-4790-9412-e5d8d2031cda
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_1db55d72-94e1-4501-9986-04958c28aab4","conversationId":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","sender":"qa-5b643413e24e","body":"Hi","createdAt":"2026-11-19T10:29:23.143643507Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27/messages
correlation: qa-9efbc2b0-7d80-46fc-8607-5636299c3094

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9efbc2b0-7d80-46fc-8607-5636299c3094
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9efbc2b0-7d80-46fc-8607-5636299c3094
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_7c0527ee-5cd8-4ac7-bad6-76fe46943568","conversationId":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","sender":"qa-f3021aca4405","body":"Reply","createdAt":"2026-11-19T10:29:23.302054684Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27/read
correlation: qa-67130507-d2dc-4fd1-b2ae-e6afa9594f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67130507-d2dc-4fd1-b2ae-e6afa9594f90
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-67130507-d2dc-4fd1-b2ae-e6afa9594f90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27/close
correlation: qa-242db27f-3488-43fc-9a0b-726cfe754656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-242db27f-3488-43fc-9a0b-726cfe754656
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-242db27f-3488-43fc-9a0b-726cfe754656
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-5b643413e24e","qa-f3021aca4405"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.143606517Z","closedAt":"2026-11-19T10:29:23.380235145Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-85f00e4a-a4c6-457e-9af9-d86d96ed044d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85f00e4a-a4c6-457e-9af9-d86d96ed044d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-85f00e4a-a4c6-457e-9af9-d86d96ed044d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_be8e83f5-5040-4f0d-a4f6-ffd24d30f464"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-87d137c6-a427-4c2a-89e4-33f253cf1b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87d137c6-a427-4c2a-89e4-33f253cf1b0d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-87d137c6-a427-4c2a-89e4-33f253cf1b0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_5dc94c92-d31b-4a89-98de-3dedfce13c10","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-19T10:29:22.319819732Z"},{"id":"led_7afac5ab-2e3a-4b71-ac3a-6196560dfc26","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_aa6a1601-bbd7-4ae5-ac59-f6787343ba27","createdAt":"2026-11-19T10:29:23.143579256Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6e3b0972-afff-4f8c-80fa-ecacbf97a6b5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-637607db1e9e4723be5df66ef15b5e36
X-Correlation-Id: qa-6e3b0972-afff-4f8c-80fa-ecacbf97a6b5
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e3b0972-afff-4f8c-80fa-ecacbf97a6b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_62ce2e2d-7a64-4bbd-ab85-fcd8228468bf
Content-Length: 144

{"id":"pur_62ce2e2d-7a64-4bbd-ab85-fcd8228468bf","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-19T10:29:23.449925333Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-172670f7-e4be-4bf0-b14f-f51599e6e4a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-172670f7-e4be-4bf0-b14f-f51599e6e4a8
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-172670f7-e4be-4bf0-b14f-f51599e6e4a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-172670f7-e4be-4bf0-b14f-f51599e6e4a8"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05be94e1-0ba1-4bf1-84bd-b7f037248481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05be94e1-0ba1-4bf1-84bd-b7f037248481
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05be94e1-0ba1-4bf1-84bd-b7f037248481
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-550ac57d-6d1a-40c0-b412-8ffae58f290e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-550ac57d-6d1a-40c0-b412-8ffae58f290e
Content-Type: application/json

--- request body ---
{"handle":"qa-f3021aca4405","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-550ac57d-6d1a-40c0-b412-8ffae58f290e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-550ac57d-6d1a-40c0-b412-8ffae58f290e"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1451ca63-8282-4524-ac19-7d53fb5be0f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1451ca63-8282-4524-ac19-7d53fb5be0f0
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1451ca63-8282-4524-ac19-7d53fb5be0f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-e2d9c169-ef9e-40b0-aab1-93159cd1c682

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2d9c169-ef9e-40b0-aab1-93159cd1c682
Content-Type: application/json

--- request body ---
{"handle":"qa-5b643413e24e","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2d9c169-ef9e-40b0-aab1-93159cd1c682
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2d9c169-ef9e-40b0-aab1-93159cd1c682"}
```
