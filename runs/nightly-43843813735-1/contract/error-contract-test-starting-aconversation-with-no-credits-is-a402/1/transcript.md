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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-22a6e6c5-84ff-4c39-b4d7-6c120ee59e70` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-f0de043f-40dc-46ed-a73d-c663f1b00c3b` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-aa9176cc-d9f5-4776-ac95-fec9eee2cf9b` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-2f3d9660-203b-4738-92f7-2f47f6b98d8e` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-e4231201-3123-47d0-8ef9-a932e378cf86` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-bf23b21d-7b09-4023-b5fc-be931af6b4ec` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 28 | `qa-e8a0bc03-fb99-4e20-8065-94087b569969` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-dab1f068-e379-460e-b7d4-e22975b25ed9` |
| 9 | `GET /v1/credits/balance` | 200 | 37 | `qa-118da72a-9f1f-4a78-bce8-99c0037832ca` |
| 10 | `POST /v1/conversations` | 402 | 10 | `qa-8d3a9a40-66de-43e3-88e1-906c143e3278` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-5c6d234b-1006-4627-a413-061124726989` |
| 12 | `POST /v1/auth/token` | 200 | 18 | `qa-b025e296-393c-4476-88b9-aa8f8819c408` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d14e5315-bd4f-4a12-8168-3f3ba2fa1405` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-e40d9324-3f88-46b5-ae1d-5d90e547f968` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-27495c9e-3973-449d-8e0e-bf2d9c365d48` |
| 16 | `POST /v1/auth/token` | 401 | 10 | `qa-c39605cb-c652-4de7-868e-3ad4a580d83c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-22a6e6c5-84ff-4c39-b4d7-6c120ee59e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22a6e6c5-84ff-4c39-b4d7-6c120ee59e70
Content-Type: application/json

--- request body ---
{"handle":"qa-89fdbae12999","displayName":"QA 89fdbae12999","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-22a6e6c5-84ff-4c39-b4d7-6c120ee59e70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-89fdbae12999
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8dde547a-89ad-4f8b-88c2-bbc43d87ed85","handle":"qa-89fdbae12999","displayName":"QA 89fdbae12999","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.815928472Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f0de043f-40dc-46ed-a73d-c663f1b00c3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0de043f-40dc-46ed-a73d-c663f1b00c3b
Content-Type: application/json

--- request body ---
{"handle":"qa-7b4439d590b8","displayName":"QA 7b4439d590b8","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0de043f-40dc-46ed-a73d-c663f1b00c3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Location: /v1/accounts/qa-7b4439d590b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c2b04c0-cdde-4761-8051-81438b0239b4","handle":"qa-7b4439d590b8","displayName":"QA 7b4439d590b8","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.860999335Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aa9176cc-d9f5-4776-ac95-fec9eee2cf9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa9176cc-d9f5-4776-ac95-fec9eee2cf9b
Content-Type: application/json

--- request body ---
{"handle":"qa-89fdbae12999","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa9176cc-d9f5-4776-ac95-fec9eee2cf9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8dde547a-89ad-4f8b-88c2-bbc43d87ed85"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2f3d9660-203b-4738-92f7-2f47f6b98d8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f3d9660-203b-4738-92f7-2f47f6b98d8e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7b4439d590b8","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f3d9660-203b-4738-92f7-2f47f6b98d8e
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
Location: /v1/conversations/cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc","subject":"Error contract","status":"open","region":"eu","participants":["qa-89fdbae12999","qa-7b4439d590b8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.936969079Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc/messages
correlation: qa-e4231201-3123-47d0-8ef9-a932e378cf86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4231201-3123-47d0-8ef9-a932e378cf86
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4231201-3123-47d0-8ef9-a932e378cf86
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

{"id":"msg_c119c6fb-4e6b-4f3c-8d43-1fcb89752d09","conversationId":"cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc","sender":"qa-89fdbae12999","body":"2","createdAt":"2026-11-16T09:53:53.967348962Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc/messages
correlation: qa-bf23b21d-7b09-4023-b5fc-be931af6b4ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf23b21d-7b09-4023-b5fc-be931af6b4ec
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf23b21d-7b09-4023-b5fc-be931af6b4ec
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

{"id":"msg_fa7befd3-342a-4395-9792-d14d5837590b","conversationId":"cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc","sender":"qa-89fdbae12999","body":"3","createdAt":"2026-11-16T09:53:53.993079977Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc/messages
correlation: qa-e8a0bc03-fb99-4e20-8065-94087b569969

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a0bc03-fb99-4e20-8065-94087b569969
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8a0bc03-fb99-4e20-8065-94087b569969
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

{"id":"msg_8e0c8a2f-7050-4065-b465-3c0729d92dee","conversationId":"cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc","sender":"qa-89fdbae12999","body":"4","createdAt":"2026-11-16T09:53:54.030103996Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc/messages
correlation: qa-dab1f068-e379-460e-b7d4-e22975b25ed9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dab1f068-e379-460e-b7d4-e22975b25ed9
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-dab1f068-e379-460e-b7d4-e22975b25ed9
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

{"id":"msg_327d14d4-ea4a-4bce-b640-cccd602df73c","conversationId":"cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc","sender":"qa-89fdbae12999","body":"5","createdAt":"2026-11-16T09:53:54.057695175Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-118da72a-9f1f-4a78-bce8-99c0037832ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-118da72a-9f1f-4a78-bce8-99c0037832ca
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-118da72a-9f1f-4a78-bce8-99c0037832ca
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

{"balance":0,"currency":"credits","accountId":"acc_8dde547a-89ad-4f8b-88c2-bbc43d87ed85"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-8d3a9a40-66de-43e3-88e1-906c143e3278

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d3a9a40-66de-43e3-88e1-906c143e3278
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7b4439d590b8","subject":"One more","message":"Hi"}

--- response: 402 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d3a9a40-66de-43e3-88e1-906c143e3278
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-8d3a9a40-66de-43e3-88e1-906c143e3278"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5c6d234b-1006-4627-a413-061124726989

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c6d234b-1006-4627-a413-061124726989
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c6d234b-1006-4627-a413-061124726989
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

{"items":[{"id":"led_6020fbca-5250-4dbb-ad39-f707ebaf95d3","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-16T09:53:53.815942472Z"},{"id":"led_eb2fa816-f107-4c50-a135-44f5872a2305","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_30d7147c-4284-47bd-bad5-1a6a06d8d5cc","createdAt":"2026-11-16T09:53:53.936961838Z"},{"id":"led_650098cf-f8be-4b51-9369-15c40b2d556c","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_c119c6fb-4e6b-4f3c-8d43-1fcb89752d09","createdAt":"2026-11-16T09:53:53.967343183Z"},{"id":"led_f4d69448-b0dc-4d06-8b9f-6e2273e69578","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_fa7befd3-342a-4395-9792-d14d5837590b","createdAt":"2026-11-16T09:53:53.993072596Z"},{"id":"led_56edfc03-bc52-40b8-8fd7-6558a7aa8639","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_8e0c8a2f-7050-4065-b465-3c0729d92dee","createdAt":"2026-11-16T09:53:54.030092859Z"},{"id":"led_b7374174-54d5-4f06-8cf2-15b1420a0fd5","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_327d14d4-ea4a-4bce-b640-cccd602df73c","createdAt":"2026-11-16T09:53:54.057689226Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b025e296-393c-4476-88b9-aa8f8819c408

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b025e296-393c-4476-88b9-aa8f8819c408
Content-Type: application/json

--- request body ---
{"handle":"qa-7b4439d590b8","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b025e296-393c-4476-88b9-aa8f8819c408
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c2b04c0-cdde-4761-8051-81438b0239b4"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d14e5315-bd4f-4a12-8168-3f3ba2fa1405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d14e5315-bd4f-4a12-8168-3f3ba2fa1405
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d14e5315-bd4f-4a12-8168-3f3ba2fa1405
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
correlation: qa-e40d9324-3f88-46b5-ae1d-5d90e547f968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e40d9324-3f88-46b5-ae1d-5d90e547f968
Content-Type: application/json

--- request body ---
{"handle":"qa-7b4439d590b8","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e40d9324-3f88-46b5-ae1d-5d90e547f968
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e40d9324-3f88-46b5-ae1d-5d90e547f968"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27495c9e-3973-449d-8e0e-bf2d9c365d48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27495c9e-3973-449d-8e0e-bf2d9c365d48
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27495c9e-3973-449d-8e0e-bf2d9c365d48
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
correlation: qa-c39605cb-c652-4de7-868e-3ad4a580d83c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39605cb-c652-4de7-868e-3ad4a580d83c
Content-Type: application/json

--- request body ---
{"handle":"qa-89fdbae12999","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c39605cb-c652-4de7-868e-3ad4a580d83c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c39605cb-c652-4de7-868e-3ad4a580d83c"}
```
