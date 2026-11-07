# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-6eab64c1-b85f-4904-a6d8-8c8fe43fc803` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-948ef7cf-f17b-4dcc-93af-a4341d911ec6` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-7c28cc68-a0de-4122-a191-826d393e1b2e` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-1e4b320e-f43c-4bf5-88f4-148f337f72b0` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-0fab4d42-6b4e-4ff7-868a-6fa92425737a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-70a4626a-9644-42bc-b243-fd3650756d6f` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-163c0056-f67f-4e77-ae11-812b583f6406` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-df666a8b-0e13-4b89-a489-46883fe1caea` |
| 9 | `GET /v1/credits/balance` | 200 | 21 | `qa-e6c06b6f-7c9e-46a9-bb0f-3575ff8fbef7` |
| 10 | `POST /v1/conversations` | 402 | 13 | `qa-8825dca9-16cc-4cee-9ca8-e0150aa23260` |
| 11 | `GET /v1/credits/ledger` | 200 | 35 | `qa-bbfd16d3-1e2e-4431-8940-65249fe273b7` |
| 12 | `POST /v1/auth/token` | 200 | 18 | `qa-8c8c20b8-0327-49bb-adf1-b352fe7a1c90` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-4b08dd38-e039-4963-ae7d-51454a34ca29` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-d515e0ca-a220-4d9d-83fd-4c8946492164` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-384edd59-52d6-4bb5-8b7e-98ad7dcb8b4d` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-0c7863c5-8649-4aa3-81db-3a1395f0f24e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6eab64c1-b85f-4904-a6d8-8c8fe43fc803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eab64c1-b85f-4904-a6d8-8c8fe43fc803
Content-Type: application/json

--- request body ---
{"handle":"qa-7452897ed5d3","displayName":"QA 7452897ed5d3","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eab64c1-b85f-4904-a6d8-8c8fe43fc803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-7452897ed5d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a60a0cc-07d7-44f0-aaaa-b97615c6ddf2","handle":"qa-7452897ed5d3","displayName":"QA 7452897ed5d3","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.166081454Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-948ef7cf-f17b-4dcc-93af-a4341d911ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-948ef7cf-f17b-4dcc-93af-a4341d911ec6
Content-Type: application/json

--- request body ---
{"handle":"qa-946fa9968ec0","displayName":"QA 946fa9968ec0","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-948ef7cf-f17b-4dcc-93af-a4341d911ec6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-946fa9968ec0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3403a3d-e191-4d71-a3f1-dc20acfcc245","handle":"qa-946fa9968ec0","displayName":"QA 946fa9968ec0","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.215125544Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7c28cc68-a0de-4122-a191-826d393e1b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c28cc68-a0de-4122-a191-826d393e1b2e
Content-Type: application/json

--- request body ---
{"handle":"qa-7452897ed5d3","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c28cc68-a0de-4122-a191-826d393e1b2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a60a0cc-07d7-44f0-aaaa-b97615c6ddf2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e4b320e-f43c-4bf5-88f4-148f337f72b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e4b320e-f43c-4bf5-88f4-148f337f72b0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-946fa9968ec0","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e4b320e-f43c-4bf5-88f4-148f337f72b0
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
Location: /v1/conversations/cnv_3baee961-00d6-4202-a870-a276fd233eb9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3baee961-00d6-4202-a870-a276fd233eb9","subject":"Error contract","status":"open","region":"eu","participants":["qa-7452897ed5d3","qa-946fa9968ec0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.308594294Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3baee961-00d6-4202-a870-a276fd233eb9/messages
correlation: qa-0fab4d42-6b4e-4ff7-868a-6fa92425737a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fab4d42-6b4e-4ff7-868a-6fa92425737a
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fab4d42-6b4e-4ff7-868a-6fa92425737a
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
Content-Length: 192

{"id":"msg_fd106a8a-5af7-479e-96e0-2ac075884ea8","conversationId":"cnv_3baee961-00d6-4202-a870-a276fd233eb9","sender":"qa-7452897ed5d3","body":"2","createdAt":"2026-11-01T09:23:23.348496646Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_3baee961-00d6-4202-a870-a276fd233eb9/messages
correlation: qa-70a4626a-9644-42bc-b243-fd3650756d6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a4626a-9644-42bc-b243-fd3650756d6f
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-70a4626a-9644-42bc-b243-fd3650756d6f
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
Content-Length: 192

{"id":"msg_9da68c2a-7402-4f95-963f-93896c43bd1c","conversationId":"cnv_3baee961-00d6-4202-a870-a276fd233eb9","sender":"qa-7452897ed5d3","body":"3","createdAt":"2026-11-01T09:23:23.401932693Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3baee961-00d6-4202-a870-a276fd233eb9/messages
correlation: qa-163c0056-f67f-4e77-ae11-812b583f6406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-163c0056-f67f-4e77-ae11-812b583f6406
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-163c0056-f67f-4e77-ae11-812b583f6406
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
Content-Length: 192

{"id":"msg_d9028c97-508a-4ccc-a9af-606b5926081e","conversationId":"cnv_3baee961-00d6-4202-a870-a276fd233eb9","sender":"qa-7452897ed5d3","body":"4","createdAt":"2026-11-01T09:23:23.451501214Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_3baee961-00d6-4202-a870-a276fd233eb9/messages
correlation: qa-df666a8b-0e13-4b89-a489-46883fe1caea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df666a8b-0e13-4b89-a489-46883fe1caea
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-df666a8b-0e13-4b89-a489-46883fe1caea
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
Content-Length: 192

{"id":"msg_4f714f5b-6d73-4ecf-beb6-17aa9504721e","conversationId":"cnv_3baee961-00d6-4202-a870-a276fd233eb9","sender":"qa-7452897ed5d3","body":"5","createdAt":"2026-11-01T09:23:23.484002392Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-e6c06b6f-7c9e-46a9-bb0f-3575ff8fbef7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6c06b6f-7c9e-46a9-bb0f-3575ff8fbef7
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6c06b6f-7c9e-46a9-bb0f-3575ff8fbef7
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
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_4a60a0cc-07d7-44f0-aaaa-b97615c6ddf2"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-8825dca9-16cc-4cee-9ca8-e0150aa23260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8825dca9-16cc-4cee-9ca8-e0150aa23260
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-946fa9968ec0","subject":"One more","message":"Hi"}

--- response: 402 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8825dca9-16cc-4cee-9ca8-e0150aa23260
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
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-8825dca9-16cc-4cee-9ca8-e0150aa23260"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bbfd16d3-1e2e-4431-8940-65249fe273b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbfd16d3-1e2e-4431-8940-65249fe273b7
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbfd16d3-1e2e-4431-8940-65249fe273b7
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
Content-Length: 1169

{"items":[{"id":"led_361bd826-d2dd-4df1-a001-133783512124","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-01T09:23:23.166091459Z"},{"id":"led_158cdd93-56fc-4272-80fb-fac8bcf7f4a6","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_3baee961-00d6-4202-a870-a276fd233eb9","createdAt":"2026-11-01T09:23:23.308581535Z"},{"id":"led_e58ac30d-adb3-4170-a199-da26356794c9","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_fd106a8a-5af7-479e-96e0-2ac075884ea8","createdAt":"2026-11-01T09:23:23.348484298Z"},{"id":"led_59353d30-a77b-4679-90d7-fe457a7e288a","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_9da68c2a-7402-4f95-963f-93896c43bd1c","createdAt":"2026-11-01T09:23:23.401925152Z"},{"id":"led_f5467bc9-ce2e-45e1-9900-f576ba2040c1","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_d9028c97-508a-4ccc-a9af-606b5926081e","createdAt":"2026-11-01T09:23:23.451488414Z"},{"id":"led_5f4b1b57-83d4-40ca-9983-2a80c74a003f","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_4f714f5b-6d73-4ecf-beb6-17aa9504721e","createdAt":"2026-11-01T09:23:23.483996243Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-8c8c20b8-0327-49bb-adf1-b352fe7a1c90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c8c20b8-0327-49bb-adf1-b352fe7a1c90
Content-Type: application/json

--- request body ---
{"handle":"qa-946fa9968ec0","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c8c20b8-0327-49bb-adf1-b352fe7a1c90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3403a3d-e191-4d71-a3f1-dc20acfcc245"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b08dd38-e039-4963-ae7d-51454a34ca29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b08dd38-e039-4963-ae7d-51454a34ca29
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b08dd38-e039-4963-ae7d-51454a34ca29
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-d515e0ca-a220-4d9d-83fd-4c8946492164

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d515e0ca-a220-4d9d-83fd-4c8946492164
Content-Type: application/json

--- request body ---
{"handle":"qa-946fa9968ec0","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d515e0ca-a220-4d9d-83fd-4c8946492164
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d515e0ca-a220-4d9d-83fd-4c8946492164"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-384edd59-52d6-4bb5-8b7e-98ad7dcb8b4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-384edd59-52d6-4bb5-8b7e-98ad7dcb8b4d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-384edd59-52d6-4bb5-8b7e-98ad7dcb8b4d
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
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-0c7863c5-8649-4aa3-81db-3a1395f0f24e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c7863c5-8649-4aa3-81db-3a1395f0f24e
Content-Type: application/json

--- request body ---
{"handle":"qa-7452897ed5d3","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c7863c5-8649-4aa3-81db-3a1395f0f24e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c7863c5-8649-4aa3-81db-3a1395f0f24e"}
```
