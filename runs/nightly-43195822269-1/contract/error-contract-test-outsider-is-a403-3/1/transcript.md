# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-0bba1d96-5a2e-47e1-aa67-2c3c52f3a1d0` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-ce576859-efbd-4ec3-9472-7a7af127b4ed` |
| 3 | `POST /v1/accounts` | 201 | 15 | `qa-ff911d1a-9534-4aa3-848c-35d391825cc3` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-14c6fd11-2922-41ce-b2e5-6b013ff487c0` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-2c12f1b2-808b-4197-bad4-0931c6817c66` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-9dee4c14-1277-4b1f-a790-0588f144e888` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 13 | `qa-45a3569f-7a0e-4ca1-9b15-fb03814ed967` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-2575a867-20e6-4c4d-b548-74b3ed2bc1e3` |
| 9 | `POST /v1/auth/token` | 401 | 61 | `qa-6423b98f-34c7-451a-a6a4-3bdd30c1e8c2` |
| 10 | `POST /v1/auth/token` | 200 | 21 | `qa-19c4c9d8-0377-457d-a131-220e4d5196ae` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-ee5b433f-78a3-42f4-8771-cebf366e6064` |
| 12 | `POST /v1/auth/token` | 401 | 20 | `qa-f750e602-474e-4fff-8785-0942e03b468d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-43b50446-2019-4299-a3ae-4d67fe789446` |
| 14 | `POST /v1/auth/token` | 401 | 16 | `qa-aada73e0-b33b-47f9-bc91-31759c4fa91e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0bba1d96-5a2e-47e1-aa67-2c3c52f3a1d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bba1d96-5a2e-47e1-aa67-2c3c52f3a1d0
Content-Type: application/json

--- request body ---
{"handle":"qa-5d6bb1d4dfde","displayName":"QA 5d6bb1d4dfde","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bba1d96-5a2e-47e1-aa67-2c3c52f3a1d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-5d6bb1d4dfde
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c24bade-fbe8-440f-8c05-f774c6978eb0","handle":"qa-5d6bb1d4dfde","displayName":"QA 5d6bb1d4dfde","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.073449776Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ce576859-efbd-4ec3-9472-7a7af127b4ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce576859-efbd-4ec3-9472-7a7af127b4ed
Content-Type: application/json

--- request body ---
{"handle":"qa-83d23dec566f","displayName":"QA 83d23dec566f","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce576859-efbd-4ec3-9472-7a7af127b4ed
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
Location: /v1/accounts/qa-83d23dec566f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_174a671a-8b16-44f2-aafa-5c0fcc171bea","handle":"qa-83d23dec566f","displayName":"QA 83d23dec566f","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.104126976Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ff911d1a-9534-4aa3-848c-35d391825cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff911d1a-9534-4aa3-848c-35d391825cc3
Content-Type: application/json

--- request body ---
{"handle":"qa-6cbc6a08c580","displayName":"QA 6cbc6a08c580","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff911d1a-9534-4aa3-848c-35d391825cc3
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
Location: /v1/accounts/qa-6cbc6a08c580
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d2e7dcc-44a6-4840-a1ea-6bb39eb3d699","handle":"qa-6cbc6a08c580","displayName":"QA 6cbc6a08c580","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.126231447Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-14c6fd11-2922-41ce-b2e5-6b013ff487c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14c6fd11-2922-41ce-b2e5-6b013ff487c0
Content-Type: application/json

--- request body ---
{"handle":"qa-5d6bb1d4dfde","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-14c6fd11-2922-41ce-b2e5-6b013ff487c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c24bade-fbe8-440f-8c05-f774c6978eb0"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2c12f1b2-808b-4197-bad4-0931c6817c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c12f1b2-808b-4197-bad4-0931c6817c66
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-83d23dec566f","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c12f1b2-808b-4197-bad4-0931c6817c66
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
Location: /v1/conversations/cnv_b0ab7a69-9b20-4e5f-a1ee-b07e2656da74
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b0ab7a69-9b20-4e5f-a1ee-b07e2656da74","subject":"Error contract","status":"open","region":"eu","participants":["qa-5d6bb1d4dfde","qa-83d23dec566f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.167591645Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9dee4c14-1277-4b1f-a790-0588f144e888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dee4c14-1277-4b1f-a790-0588f144e888
Content-Type: application/json

--- request body ---
{"handle":"qa-6cbc6a08c580","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dee4c14-1277-4b1f-a790-0588f144e888
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d2e7dcc-44a6-4840-a1ea-6bb39eb3d699"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b0ab7a69-9b20-4e5f-a1ee-b07e2656da74/read
correlation: qa-45a3569f-7a0e-4ca1-9b15-fb03814ed967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a3569f-7a0e-4ca1-9b15-fb03814ed967
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45a3569f-7a0e-4ca1-9b15-fb03814ed967
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b0ab7a69-9b20-4e5f-a1ee-b07e2656da74/read","correlationId":"qa-45a3569f-7a0e-4ca1-9b15-fb03814ed967"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2575a867-20e6-4c4d-b548-74b3ed2bc1e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2575a867-20e6-4c4d-b548-74b3ed2bc1e3
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2575a867-20e6-4c4d-b548-74b3ed2bc1e3
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-6423b98f-34c7-451a-a6a4-3bdd30c1e8c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6423b98f-34c7-451a-a6a4-3bdd30c1e8c2
Content-Type: application/json

--- request body ---
{"handle":"qa-6cbc6a08c580","password":"****"}

--- response: 401 in 61 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6423b98f-34c7-451a-a6a4-3bdd30c1e8c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6423b98f-34c7-451a-a6a4-3bdd30c1e8c2"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-19c4c9d8-0377-457d-a131-220e4d5196ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19c4c9d8-0377-457d-a131-220e4d5196ae
Content-Type: application/json

--- request body ---
{"handle":"qa-83d23dec566f","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-19c4c9d8-0377-457d-a131-220e4d5196ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_174a671a-8b16-44f2-aafa-5c0fcc171bea"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee5b433f-78a3-42f4-8771-cebf366e6064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee5b433f-78a3-42f4-8771-cebf366e6064
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee5b433f-78a3-42f4-8771-cebf366e6064
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-f750e602-474e-4fff-8785-0942e03b468d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f750e602-474e-4fff-8785-0942e03b468d
Content-Type: application/json

--- request body ---
{"handle":"qa-83d23dec566f","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f750e602-474e-4fff-8785-0942e03b468d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f750e602-474e-4fff-8785-0942e03b468d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43b50446-2019-4299-a3ae-4d67fe789446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43b50446-2019-4299-a3ae-4d67fe789446
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43b50446-2019-4299-a3ae-4d67fe789446
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-aada73e0-b33b-47f9-bc91-31759c4fa91e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aada73e0-b33b-47f9-bc91-31759c4fa91e
Content-Type: application/json

--- request body ---
{"handle":"qa-5d6bb1d4dfde","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aada73e0-b33b-47f9-bc91-31759c4fa91e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aada73e0-b33b-47f9-bc91-31759c4fa91e"}
```
