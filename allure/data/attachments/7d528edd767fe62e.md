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
| 1 | `POST /v1/accounts` | 201 | 411 | `qa-9811c58d-a1e8-4109-9df5-09f489d13aa1` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-c480c6d0-4f11-417c-a6f1-fad867b46791` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-72ef314b-9e9f-4ccf-9d9b-aafa1893b44d` |
| 4 | `POST /v1/conversations` | 201 | 77 | `qa-92576c04-57ec-4416-8ef8-940a8c40edfc` |
| 5 | `GET /v1/conversations` | 200 | 44 | `qa-e2e3308b-12ed-4cb9-9e8a-55d94b3b9981` |
| 6 | `GET /v1/conversations/{id}` | 200 | 21 | `qa-657f0675-2c37-41d5-88b9-4e1d8c1be156` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-a16fec3d-a517-493b-973d-7e69c15151f6` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-267e1ddc-856c-43d1-ac57-096f7b824cf6` |
| 9 | `POST /v1/auth/token` | 200 | 11 | `qa-f81552b2-f9ce-46ce-abcd-2d02852d55de` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 12 | `qa-9dd26fd4-e963-4d8c-8105-e820a97f9760` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2121a06f-d18a-4390-88b6-bb604071a8a4` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-628e0014-72d4-495b-ab36-91ac0095c48c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2fc676af-3f98-4b5a-93c5-5886274052e2` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-fe1656fc-3c8c-436b-8874-0b984e2b71e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9811c58d-a1e8-4109-9df5-09f489d13aa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9811c58d-a1e8-4109-9df5-09f489d13aa1
Content-Type: application/json

--- request body ---
{"handle":"qa-1b1631025847","displayName":"QA 1b1631025847","password":"****","region":"eu"}

--- response: 201 in 411 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-9811c58d-a1e8-4109-9df5-09f489d13aa1
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
Location: /v1/accounts/qa-1b1631025847
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d05e3c08-7e59-43f5-bba0-3839725e1b12","handle":"qa-1b1631025847","displayName":"QA 1b1631025847","region":"eu","role":"user","createdAt":"2026-11-28T10:37:21.411221583Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c480c6d0-4f11-417c-a6f1-fad867b46791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c480c6d0-4f11-417c-a6f1-fad867b46791
Content-Type: application/json

--- request body ---
{"handle":"qa-fccbbdb003ff","displayName":"QA fccbbdb003ff","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-c480c6d0-4f11-417c-a6f1-fad867b46791
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
Location: /v1/accounts/qa-fccbbdb003ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d155ac75-6244-4849-82e2-d5c4f1b66bae","handle":"qa-fccbbdb003ff","displayName":"QA fccbbdb003ff","region":"eu","role":"user","createdAt":"2026-11-28T10:37:21.823742337Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-72ef314b-9e9f-4ccf-9d9b-aafa1893b44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72ef314b-9e9f-4ccf-9d9b-aafa1893b44d
Content-Type: application/json

--- request body ---
{"handle":"qa-1b1631025847","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-72ef314b-9e9f-4ccf-9d9b-aafa1893b44d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d05e3c08-7e59-43f5-bba0-3839725e1b12"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-92576c04-57ec-4416-8ef8-940a8c40edfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92576c04-57ec-4416-8ef8-940a8c40edfc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fccbbdb003ff","subject":"Contract check","message":"Hello"}

--- response: 201 in 77 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-92576c04-57ec-4416-8ef8-940a8c40edfc
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
Location: /v1/conversations/cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57","subject":"Contract check","status":"open","region":"eu","participants":["qa-1b1631025847","qa-fccbbdb003ff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.008471734Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-e2e3308b-12ed-4cb9-9e8a-55d94b3b9981

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e3308b-12ed-4cb9-9e8a-55d94b3b9981
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2e3308b-12ed-4cb9-9e8a-55d94b3b9981
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

{"items":[{"id":"cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57","subject":"Contract check","status":"open","region":"eu","participants":["qa-1b1631025847","qa-fccbbdb003ff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.008471734Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57
correlation: qa-657f0675-2c37-41d5-88b9-4e1d8c1be156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-657f0675-2c37-41d5-88b9-4e1d8c1be156
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-657f0675-2c37-41d5-88b9-4e1d8c1be156
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

{"id":"cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57","subject":"Contract check","status":"open","region":"eu","participants":["qa-1b1631025847","qa-fccbbdb003ff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.008471734Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57/messages
correlation: qa-a16fec3d-a517-493b-973d-7e69c15151f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a16fec3d-a517-493b-973d-7e69c15151f6
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a16fec3d-a517-493b-973d-7e69c15151f6
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

{"id":"msg_1c222c2a-3728-4ae5-a1f5-9b94ff6164c8","conversationId":"cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57","sender":"qa-1b1631025847","body":"Second","createdAt":"2026-11-28T10:37:22.243859010Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57/messages
correlation: qa-267e1ddc-856c-43d1-ac57-096f7b824cf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-267e1ddc-856c-43d1-ac57-096f7b824cf6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-267e1ddc-856c-43d1-ac57-096f7b824cf6
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

{"items":[{"id":"msg_0ef772c3-e41d-4a73-9797-debf21773840","conversationId":"cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57","sender":"qa-1b1631025847","body":"Hello","createdAt":"2026-11-28T10:37:22.008812410Z"},{"id":"msg_1c222c2a-3728-4ae5-a1f5-9b94ff6164c8","conversationId":"cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57","sender":"qa-1b1631025847","body":"Second","createdAt":"2026-11-28T10:37:22.243859010Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f81552b2-f9ce-46ce-abcd-2d02852d55de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f81552b2-f9ce-46ce-abcd-2d02852d55de
Content-Type: application/json

--- request body ---
{"handle":"qa-fccbbdb003ff","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f81552b2-f9ce-46ce-abcd-2d02852d55de
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d155ac75-6244-4849-82e2-d5c4f1b66bae"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57/read
correlation: qa-9dd26fd4-e963-4d8c-8105-e820a97f9760

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dd26fd4-e963-4d8c-8105-e820a97f9760
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dd26fd4-e963-4d8c-8105-e820a97f9760
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

{"conversationId":"cnv_fb22f6ec-ad56-45f9-9e3f-bf5e350cdc57","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2121a06f-d18a-4390-88b6-bb604071a8a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2121a06f-d18a-4390-88b6-bb604071a8a4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2121a06f-d18a-4390-88b6-bb604071a8a4
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
correlation: qa-628e0014-72d4-495b-ab36-91ac0095c48c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-628e0014-72d4-495b-ab36-91ac0095c48c
Content-Type: application/json

--- request body ---
{"handle":"qa-fccbbdb003ff","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-628e0014-72d4-495b-ab36-91ac0095c48c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-628e0014-72d4-495b-ab36-91ac0095c48c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fc676af-3f98-4b5a-93c5-5886274052e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fc676af-3f98-4b5a-93c5-5886274052e2
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fc676af-3f98-4b5a-93c5-5886274052e2
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
correlation: qa-fe1656fc-3c8c-436b-8874-0b984e2b71e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe1656fc-3c8c-436b-8874-0b984e2b71e3
Content-Type: application/json

--- request body ---
{"handle":"qa-1b1631025847","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe1656fc-3c8c-436b-8874-0b984e2b71e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe1656fc-3c8c-436b-8874-0b984e2b71e3"}
```
