# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 401 | `qa-15ea8eb9-bd50-43df-ab0f-3929b2c4a1ed` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-baf98407-be01-4402-8774-95d93eadd573` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-2fd3cbcc-f4ab-4a8d-970d-cf859feec650` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-ff8b0a11-48af-475e-b7cc-e5e834e6b56b` |
| 5 | `GET /v1/conversations` | 200 | 16 | `qa-7514ec3a-b12e-4598-bde9-6465dfdb637d` |
| 6 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-7608f45f-dfae-4032-822f-15ad333a9878` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-5c5b2fa3-bac5-44a4-a954-278b2deb3805` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-3f6ede8a-fa4e-4b34-803c-b27d7d1d8af9` |
| 9 | `POST /v1/auth/token` | 200 | 15 | `qa-39986615-e027-457b-b976-1755a05583d0` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 23 | `qa-6805cc9c-6b84-4a74-ba8d-ae1cb6de0fdd` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-b20bf200-3b9a-44ac-9d77-ca340aef440d` |
| 12 | `POST /v1/auth/token` | 401 | 10 | `qa-792be6a7-f1e1-479e-bc4b-c70ea99907a3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-2079e345-b5ce-4892-aca5-dfc1cfa86c87` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-3b80afbe-1125-4e43-b126-4b4bfbc1886a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15ea8eb9-bd50-43df-ab0f-3929b2c4a1ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ea8eb9-bd50-43df-ab0f-3929b2c4a1ed
Content-Type: application/json

--- request body ---
{"handle":"qa-2d2c713dcc84","displayName":"QA 2d2c713dcc84","password":"****","region":"eu"}

--- response: 201 in 401 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-15ea8eb9-bd50-43df-ab0f-3929b2c4a1ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-2d2c713dcc84
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7635a35-ac96-4b6e-9790-5567eea3bde9","handle":"qa-2d2c713dcc84","displayName":"QA 2d2c713dcc84","region":"eu","role":"user","createdAt":"2026-11-15T09:36:07.191149279Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-baf98407-be01-4402-8774-95d93eadd573

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baf98407-be01-4402-8774-95d93eadd573
Content-Type: application/json

--- request body ---
{"handle":"qa-5d2be4712a67","displayName":"QA 5d2be4712a67","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-baf98407-be01-4402-8774-95d93eadd573
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-5d2be4712a67
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a8b7148-8e69-492d-9248-01e0abab62ec","handle":"qa-5d2be4712a67","displayName":"QA 5d2be4712a67","region":"eu","role":"user","createdAt":"2026-11-15T09:36:07.561860366Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2fd3cbcc-f4ab-4a8d-970d-cf859feec650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd3cbcc-f4ab-4a8d-970d-cf859feec650
Content-Type: application/json

--- request body ---
{"handle":"qa-2d2c713dcc84","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fd3cbcc-f4ab-4a8d-970d-cf859feec650
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7635a35-ac96-4b6e-9790-5567eea3bde9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ff8b0a11-48af-475e-b7cc-e5e834e6b56b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff8b0a11-48af-475e-b7cc-e5e834e6b56b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5d2be4712a67","subject":"Contract check","message":"Hello"}

--- response: 201 in 48 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff8b0a11-48af-475e-b7cc-e5e834e6b56b
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
Location: /v1/conversations/cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03","subject":"Contract check","status":"open","region":"eu","participants":["qa-2d2c713dcc84","qa-5d2be4712a67"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:07.683304497Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-7514ec3a-b12e-4598-bde9-6465dfdb637d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7514ec3a-b12e-4598-bde9-6465dfdb637d
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7514ec3a-b12e-4598-bde9-6465dfdb637d
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
Content-Length: 259

{"items":[{"id":"cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03","subject":"Contract check","status":"open","region":"eu","participants":["qa-2d2c713dcc84","qa-5d2be4712a67"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:07.683304497Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03
correlation: qa-7608f45f-dfae-4032-822f-15ad333a9878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7608f45f-dfae-4032-822f-15ad333a9878
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7608f45f-dfae-4032-822f-15ad333a9878
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03","subject":"Contract check","status":"open","region":"eu","participants":["qa-2d2c713dcc84","qa-5d2be4712a67"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:07.683304497Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03/messages
correlation: qa-5c5b2fa3-bac5-44a4-a954-278b2deb3805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c5b2fa3-bac5-44a4-a954-278b2deb3805
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c5b2fa3-bac5-44a4-a954-278b2deb3805
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
Content-Length: 197

{"id":"msg_a20f4365-f5dc-439b-9033-912abe023294","conversationId":"cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03","sender":"qa-2d2c713dcc84","body":"Second","createdAt":"2026-11-15T09:36:07.801153524Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03/messages
correlation: qa-3f6ede8a-fa4e-4b34-803c-b27d7d1d8af9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f6ede8a-fa4e-4b34-803c-b27d7d1d8af9
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f6ede8a-fa4e-4b34-803c-b27d7d1d8af9
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
Content-Length: 416

{"items":[{"id":"msg_4b6d8639-fe4c-4020-82ac-38abab69c121","conversationId":"cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03","sender":"qa-2d2c713dcc84","body":"Hello","createdAt":"2026-11-15T09:36:07.683503117Z"},{"id":"msg_a20f4365-f5dc-439b-9033-912abe023294","conversationId":"cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03","sender":"qa-2d2c713dcc84","body":"Second","createdAt":"2026-11-15T09:36:07.801153524Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-39986615-e027-457b-b976-1755a05583d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39986615-e027-457b-b976-1755a05583d0
Content-Type: application/json

--- request body ---
{"handle":"qa-5d2be4712a67","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-39986615-e027-457b-b976-1755a05583d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a8b7148-8e69-492d-9248-01e0abab62ec"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03/read
correlation: qa-6805cc9c-6b84-4a74-ba8d-ae1cb6de0fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6805cc9c-6b84-4a74-ba8d-ae1cb6de0fdd
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6805cc9c-6b84-4a74-ba8d-ae1cb6de0fdd
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
Content-Length: 77

{"conversationId":"cnv_8a86a6d5-f6ed-40c2-82f8-7a7c329eec03","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b20bf200-3b9a-44ac-9d77-ca340aef440d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b20bf200-3b9a-44ac-9d77-ca340aef440d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b20bf200-3b9a-44ac-9d77-ca340aef440d
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-792be6a7-f1e1-479e-bc4b-c70ea99907a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-792be6a7-f1e1-479e-bc4b-c70ea99907a3
Content-Type: application/json

--- request body ---
{"handle":"qa-5d2be4712a67","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-792be6a7-f1e1-479e-bc4b-c70ea99907a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-792be6a7-f1e1-479e-bc4b-c70ea99907a3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2079e345-b5ce-4892-aca5-dfc1cfa86c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2079e345-b5ce-4892-aca5-dfc1cfa86c87
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2079e345-b5ce-4892-aca5-dfc1cfa86c87
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-3b80afbe-1125-4e43-b126-4b4bfbc1886a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b80afbe-1125-4e43-b126-4b4bfbc1886a
Content-Type: application/json

--- request body ---
{"handle":"qa-2d2c713dcc84","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b80afbe-1125-4e43-b126-4b4bfbc1886a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b80afbe-1125-4e43-b126-4b4bfbc1886a"}
```
