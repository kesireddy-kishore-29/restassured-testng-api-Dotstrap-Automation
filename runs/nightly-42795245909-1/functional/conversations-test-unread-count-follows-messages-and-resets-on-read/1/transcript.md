# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-eff9f018-34e7-4106-9f33-3e505d7ea897` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-068aa7fd-8712-4ccd-a2e2-41925c1c36d2` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-ab1753fe-3c4e-48a5-8ee5-76650a75ec38` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-625b0175-9809-4656-abc0-269ae735f7a5` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 36 | `qa-14f647b2-5916-454a-8659-d6fb24e92c1c` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-ce078472-62d2-4937-8068-4eeee8cbf4a2` |
| 7 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-f4b41206-ac68-4359-b570-fdf9c7519122` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-b7868849-6da0-4d41-a0a9-09c4b2f56542` |
| 9 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-e8447b5d-d307-4a40-935a-b89b5209fbe0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e85b322e-5998-45ba-82e4-b7eb71ac2e05` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-10cf6bdf-eb65-4b8b-aa5b-88a76c130291` |
| 12 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5e3fc90f-a049-47a1-bfb7-f81e1deee591` |
| 13 | `POST /v1/auth/token` | 401 | 6 | `qa-06080dec-6bd9-4cfe-a34f-991fbe71746f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eff9f018-34e7-4106-9f33-3e505d7ea897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eff9f018-34e7-4106-9f33-3e505d7ea897
Content-Type: application/json

--- request body ---
{"handle":"qa-9e2614cdeeb1","displayName":"QA 9e2614cdeeb1","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-eff9f018-34e7-4106-9f33-3e505d7ea897
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
Location: /v1/accounts/qa-9e2614cdeeb1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_83acbeaa-8f3e-4319-ad25-24a814e5170d","handle":"qa-9e2614cdeeb1","displayName":"QA 9e2614cdeeb1","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.257010128Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-068aa7fd-8712-4ccd-a2e2-41925c1c36d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-068aa7fd-8712-4ccd-a2e2-41925c1c36d2
Content-Type: application/json

--- request body ---
{"handle":"qa-ef296276ca32","displayName":"QA ef296276ca32","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-068aa7fd-8712-4ccd-a2e2-41925c1c36d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-ef296276ca32
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe2ceb59-7a13-4ee4-ac03-c3862785c910","handle":"qa-ef296276ca32","displayName":"QA ef296276ca32","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.609803568Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ab1753fe-3c4e-48a5-8ee5-76650a75ec38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab1753fe-3c4e-48a5-8ee5-76650a75ec38
Content-Type: application/json

--- request body ---
{"handle":"qa-9e2614cdeeb1","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab1753fe-3c4e-48a5-8ee5-76650a75ec38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_83acbeaa-8f3e-4319-ad25-24a814e5170d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-625b0175-9809-4656-abc0-269ae735f7a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-625b0175-9809-4656-abc0-269ae735f7a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ef296276ca32","subject":"Updates","message":"First"}

--- response: 201 in 41 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-625b0175-9809-4656-abc0-269ae735f7a5
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
Location: /v1/conversations/cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb","subject":"Updates","status":"open","region":"eu","participants":["qa-9e2614cdeeb1","qa-ef296276ca32"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.755051195Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb/messages
correlation: qa-14f647b2-5916-454a-8659-d6fb24e92c1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14f647b2-5916-454a-8659-d6fb24e92c1c
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-14f647b2-5916-454a-8659-d6fb24e92c1c
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
Content-Length: 197

{"id":"msg_20d90b34-3756-4ed5-ab7f-e439197054d3","conversationId":"cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb","sender":"qa-9e2614cdeeb1","body":"Second","createdAt":"2026-11-10T09:59:37.862631921Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ce078472-62d2-4937-8068-4eeee8cbf4a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce078472-62d2-4937-8068-4eeee8cbf4a2
Content-Type: application/json

--- request body ---
{"handle":"qa-ef296276ca32","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce078472-62d2-4937-8068-4eeee8cbf4a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe2ceb59-7a13-4ee4-ac03-c3862785c910"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb
correlation: qa-f4b41206-ac68-4359-b570-fdf9c7519122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b41206-ac68-4359-b570-fdf9c7519122
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b41206-ac68-4359-b570-fdf9c7519122
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb","subject":"Updates","status":"open","region":"eu","participants":["qa-9e2614cdeeb1","qa-ef296276ca32"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-10T09:59:37.755051195Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb/read
correlation: qa-b7868849-6da0-4d41-a0a9-09c4b2f56542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7868849-6da0-4d41-a0a9-09c4b2f56542
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7868849-6da0-4d41-a0a9-09c4b2f56542
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
Content-Length: 77

{"conversationId":"cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb
correlation: qa-e8447b5d-d307-4a40-935a-b89b5209fbe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8447b5d-d307-4a40-935a-b89b5209fbe0
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8447b5d-d307-4a40-935a-b89b5209fbe0
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
Content-Length: 230

{"id":"cnv_e556c42f-dd6b-47c8-aa0f-64fc042c83bb","subject":"Updates","status":"open","region":"eu","participants":["qa-9e2614cdeeb1","qa-ef296276ca32"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.755051195Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e85b322e-5998-45ba-82e4-b7eb71ac2e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e85b322e-5998-45ba-82e4-b7eb71ac2e05
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e85b322e-5998-45ba-82e4-b7eb71ac2e05
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-10cf6bdf-eb65-4b8b-aa5b-88a76c130291

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10cf6bdf-eb65-4b8b-aa5b-88a76c130291
Content-Type: application/json

--- request body ---
{"handle":"qa-ef296276ca32","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10cf6bdf-eb65-4b8b-aa5b-88a76c130291
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10cf6bdf-eb65-4b8b-aa5b-88a76c130291"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e3fc90f-a049-47a1-bfb7-f81e1deee591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e3fc90f-a049-47a1-bfb7-f81e1deee591
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e3fc90f-a049-47a1-bfb7-f81e1deee591
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-06080dec-6bd9-4cfe-a34f-991fbe71746f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06080dec-6bd9-4cfe-a34f-991fbe71746f
Content-Type: application/json

--- request body ---
{"handle":"qa-9e2614cdeeb1","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06080dec-6bd9-4cfe-a34f-991fbe71746f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06080dec-6bd9-4cfe-a34f-991fbe71746f"}
```
