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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-e633d7e9-a464-48f7-9824-652d3b338056` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-6a4d80a6-40e6-44ab-8533-9c73754d9183` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-7e30539f-54ce-4e6e-a300-9d4e34f63270` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-04c0852a-7510-4bb4-b076-1d69140710cf` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 28 | `qa-cfa5154f-8f65-4ba2-861a-7ca71ed3bdba` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-391a123e-a7c0-421b-9ffa-00a9e1b7aabf` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-52bd4050-944a-4c3a-9ded-9973c91f4500` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 33 | `qa-aa54bb36-99f4-422e-89f6-47ff76b284de` |
| 9 | `GET /v1/credits/balance` | 200 | 56 | `qa-d229d826-7252-4cc9-892a-c472cc46dcfd` |
| 10 | `POST /v1/conversations` | 402 | 12 | `qa-3899cc0b-1abe-4baa-b682-0fa68717c7e0` |
| 11 | `GET /v1/credits/ledger` | 200 | 19 | `qa-da305a2d-a3aa-485d-9a37-938313be50c9` |
| 12 | `POST /v1/auth/token` | 200 | 20 | `qa-24090780-aae6-4fcd-8a40-a732c5f29038` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e5ea1a2b-44b0-43e9-950a-19099e6bb63c` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-8094f80e-e7d4-494b-bfc4-7c5805638aa6` |
| 15 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5d8b3906-4477-4928-aa1a-acc5334c7140` |
| 16 | `POST /v1/auth/token` | 401 | 11 | `qa-e644cfec-87b9-4806-91f5-8df84d6e320f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e633d7e9-a464-48f7-9824-652d3b338056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e633d7e9-a464-48f7-9824-652d3b338056
Content-Type: application/json

--- request body ---
{"handle":"qa-2d85b928abcc","displayName":"QA 2d85b928abcc","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e633d7e9-a464-48f7-9824-652d3b338056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Location: /v1/accounts/qa-2d85b928abcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37f63964-7541-4c15-bfea-be33f54b2e36","handle":"qa-2d85b928abcc","displayName":"QA 2d85b928abcc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.863164218Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6a4d80a6-40e6-44ab-8533-9c73754d9183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a4d80a6-40e6-44ab-8533-9c73754d9183
Content-Type: application/json

--- request body ---
{"handle":"qa-74563902816a","displayName":"QA 74563902816a","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a4d80a6-40e6-44ab-8533-9c73754d9183
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 6
Location: /v1/accounts/qa-74563902816a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d9488631-981c-4b96-8cf3-b999d574faca","handle":"qa-74563902816a","displayName":"QA 74563902816a","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.925665940Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7e30539f-54ce-4e6e-a300-9d4e34f63270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e30539f-54ce-4e6e-a300-9d4e34f63270
Content-Type: application/json

--- request body ---
{"handle":"qa-2d85b928abcc","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e30539f-54ce-4e6e-a300-9d4e34f63270
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37f63964-7541-4c15-bfea-be33f54b2e36"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-04c0852a-7510-4bb4-b076-1d69140710cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04c0852a-7510-4bb4-b076-1d69140710cf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-74563902816a","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-04c0852a-7510-4bb4-b076-1d69140710cf
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
Location: /v1/conversations/cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa","subject":"Error contract","status":"open","region":"eu","participants":["qa-2d85b928abcc","qa-74563902816a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.031493178Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa/messages
correlation: qa-cfa5154f-8f65-4ba2-861a-7ca71ed3bdba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfa5154f-8f65-4ba2-861a-7ca71ed3bdba
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfa5154f-8f65-4ba2-861a-7ca71ed3bdba
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

{"id":"msg_5077c886-3722-4343-bcd5-48674b0dd5bf","conversationId":"cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa","sender":"qa-2d85b928abcc","body":"2","createdAt":"2026-11-21T09:57:12.081016284Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa/messages
correlation: qa-391a123e-a7c0-421b-9ffa-00a9e1b7aabf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391a123e-a7c0-421b-9ffa-00a9e1b7aabf
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-391a123e-a7c0-421b-9ffa-00a9e1b7aabf
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

{"id":"msg_f5887dd0-bf57-434e-afda-2c2dadc70a91","conversationId":"cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa","sender":"qa-2d85b928abcc","body":"3","createdAt":"2026-11-21T09:57:12.129506097Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa/messages
correlation: qa-52bd4050-944a-4c3a-9ded-9973c91f4500

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52bd4050-944a-4c3a-9ded-9973c91f4500
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-52bd4050-944a-4c3a-9ded-9973c91f4500
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

{"id":"msg_0d03539f-c327-4179-b1cc-bd302d53eb25","conversationId":"cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa","sender":"qa-2d85b928abcc","body":"4","createdAt":"2026-11-21T09:57:12.179505110Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa/messages
correlation: qa-aa54bb36-99f4-422e-89f6-47ff76b284de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa54bb36-99f4-422e-89f6-47ff76b284de
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa54bb36-99f4-422e-89f6-47ff76b284de
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

{"id":"msg_af321f03-f2c4-4bf3-b222-ebe037081d33","conversationId":"cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa","sender":"qa-2d85b928abcc","body":"5","createdAt":"2026-11-21T09:57:12.238584696Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-d229d826-7252-4cc9-892a-c472cc46dcfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d229d826-7252-4cc9-892a-c472cc46dcfd
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d229d826-7252-4cc9-892a-c472cc46dcfd
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

{"balance":0,"currency":"credits","accountId":"acc_37f63964-7541-4c15-bfea-be33f54b2e36"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-3899cc0b-1abe-4baa-b682-0fa68717c7e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3899cc0b-1abe-4baa-b682-0fa68717c7e0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-74563902816a","subject":"One more","message":"Hi"}

--- response: 402 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3899cc0b-1abe-4baa-b682-0fa68717c7e0
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-3899cc0b-1abe-4baa-b682-0fa68717c7e0"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-da305a2d-a3aa-485d-9a37-938313be50c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da305a2d-a3aa-485d-9a37-938313be50c9
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-da305a2d-a3aa-485d-9a37-938313be50c9
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

{"items":[{"id":"led_fea71e01-25e8-429b-a104-fec020e987ce","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-21T09:57:11.863184055Z"},{"id":"led_e2fbe54a-302b-4aec-aaad-d122685239e5","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_67ba8b5e-f055-43c9-a24a-79323896e2aa","createdAt":"2026-11-21T09:57:12.031478330Z"},{"id":"led_5bc39f33-0e3d-4b43-b308-8885647761b1","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_5077c886-3722-4343-bcd5-48674b0dd5bf","createdAt":"2026-11-21T09:57:12.080997720Z"},{"id":"led_82bf21f7-8c09-4af7-ba9d-f45aca0d28c5","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_f5887dd0-bf57-434e-afda-2c2dadc70a91","createdAt":"2026-11-21T09:57:12.129497170Z"},{"id":"led_b920583d-f589-4df9-a536-cd83d5a378dc","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_0d03539f-c327-4179-b1cc-bd302d53eb25","createdAt":"2026-11-21T09:57:12.179479944Z"},{"id":"led_f9a93239-fa2d-4e7b-851a-274c01dc7736","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_af321f03-f2c4-4bf3-b222-ebe037081d33","createdAt":"2026-11-21T09:57:12.238572022Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-24090780-aae6-4fcd-8a40-a732c5f29038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24090780-aae6-4fcd-8a40-a732c5f29038
Content-Type: application/json

--- request body ---
{"handle":"qa-74563902816a","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-24090780-aae6-4fcd-8a40-a732c5f29038
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d9488631-981c-4b96-8cf3-b999d574faca"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e5ea1a2b-44b0-43e9-950a-19099e6bb63c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ea1a2b-44b0-43e9-950a-19099e6bb63c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e5ea1a2b-44b0-43e9-950a-19099e6bb63c
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
correlation: qa-8094f80e-e7d4-494b-bfc4-7c5805638aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8094f80e-e7d4-494b-bfc4-7c5805638aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-74563902816a","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8094f80e-e7d4-494b-bfc4-7c5805638aa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8094f80e-e7d4-494b-bfc4-7c5805638aa6"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d8b3906-4477-4928-aa1a-acc5334c7140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d8b3906-4477-4928-aa1a-acc5334c7140
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d8b3906-4477-4928-aa1a-acc5334c7140
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
correlation: qa-e644cfec-87b9-4806-91f5-8df84d6e320f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e644cfec-87b9-4806-91f5-8df84d6e320f
Content-Type: application/json

--- request body ---
{"handle":"qa-2d85b928abcc","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e644cfec-87b9-4806-91f5-8df84d6e320f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e644cfec-87b9-4806-91f5-8df84d6e320f"}
```
