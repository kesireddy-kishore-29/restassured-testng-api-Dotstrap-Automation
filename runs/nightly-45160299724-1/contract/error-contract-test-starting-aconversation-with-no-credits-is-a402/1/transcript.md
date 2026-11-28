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
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-1b56e208-54f1-493d-a084-0a8c3b3069b6` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-89fa8235-006f-4b0b-9366-00df2351a023` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-8b284cac-10ae-4652-80ff-074aa899159c` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-63d41a09-7583-4fe6-b50f-e0c4ce9e0801` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-18f97295-aca3-4cfa-abb0-78c09057d494` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-abfca5f8-da14-4822-ac9d-fa10837b2eb1` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-a0e324ec-bdda-49c7-9cb7-ec5cc279d519` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-bd73eab8-404b-485f-8e0d-e0d942f10d8f` |
| 9 | `GET /v1/credits/balance` | 200 | 19 | `qa-cad49cac-6cd8-42bd-8dc5-07405f458ab1` |
| 10 | `POST /v1/conversations` | 402 | 19 | `qa-fc67874c-3acd-4e7a-bc78-016caa05dda3` |
| 11 | `GET /v1/credits/ledger` | 200 | 8 | `qa-fb013845-52a5-4ea1-8f0c-27c79fa03840` |
| 12 | `POST /v1/auth/token` | 200 | 15 | `qa-aa6a479e-5785-4dc3-9655-8b705c0ef227` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a7b1c087-1566-47c7-a28f-96ecde15ab75` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-996a58ca-6d09-4b23-9e7d-d8578c163643` |
| 15 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-0ca7f1f5-2b68-470d-9caf-f43141f17335` |
| 16 | `POST /v1/auth/token` | 401 | 12 | `qa-ad79a158-17e5-42f5-8986-e55cba6dea0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1b56e208-54f1-493d-a084-0a8c3b3069b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b56e208-54f1-493d-a084-0a8c3b3069b6
Content-Type: application/json

--- request body ---
{"handle":"qa-9982158dec1a","displayName":"QA 9982158dec1a","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b56e208-54f1-493d-a084-0a8c3b3069b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-9982158dec1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50dfd5e5-492e-4b68-bc97-177196a9b23b","handle":"qa-9982158dec1a","displayName":"QA 9982158dec1a","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.389910586Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-89fa8235-006f-4b0b-9366-00df2351a023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89fa8235-006f-4b0b-9366-00df2351a023
Content-Type: application/json

--- request body ---
{"handle":"qa-4a3057759c6c","displayName":"QA 4a3057759c6c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-89fa8235-006f-4b0b-9366-00df2351a023
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-4a3057759c6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb68941c-1541-4c53-a7ca-9011238a64c7","handle":"qa-4a3057759c6c","displayName":"QA 4a3057759c6c","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.438334685Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8b284cac-10ae-4652-80ff-074aa899159c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b284cac-10ae-4652-80ff-074aa899159c
Content-Type: application/json

--- request body ---
{"handle":"qa-9982158dec1a","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b284cac-10ae-4652-80ff-074aa899159c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50dfd5e5-492e-4b68-bc97-177196a9b23b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-63d41a09-7583-4fe6-b50f-e0c4ce9e0801

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63d41a09-7583-4fe6-b50f-e0c4ce9e0801
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4a3057759c6c","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-63d41a09-7583-4fe6-b50f-e0c4ce9e0801
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
Location: /v1/conversations/cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f","subject":"Error contract","status":"open","region":"eu","participants":["qa-9982158dec1a","qa-4a3057759c6c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.502637089Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f/messages
correlation: qa-18f97295-aca3-4cfa-abb0-78c09057d494

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18f97295-aca3-4cfa-abb0-78c09057d494
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-18f97295-aca3-4cfa-abb0-78c09057d494
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

{"id":"msg_43fac967-642c-46e2-8553-956a5c0ebae1","conversationId":"cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f","sender":"qa-9982158dec1a","body":"2","createdAt":"2026-11-23T10:54:59.535936537Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f/messages
correlation: qa-abfca5f8-da14-4822-ac9d-fa10837b2eb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfca5f8-da14-4822-ac9d-fa10837b2eb1
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-abfca5f8-da14-4822-ac9d-fa10837b2eb1
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

{"id":"msg_3cf71343-75f0-45c2-9f01-c276c4d61267","conversationId":"cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f","sender":"qa-9982158dec1a","body":"3","createdAt":"2026-11-23T10:54:59.577497760Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f/messages
correlation: qa-a0e324ec-bdda-49c7-9cb7-ec5cc279d519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0e324ec-bdda-49c7-9cb7-ec5cc279d519
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0e324ec-bdda-49c7-9cb7-ec5cc279d519
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

{"id":"msg_0d72f691-0a19-4adf-87fd-9f2d63c18108","conversationId":"cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f","sender":"qa-9982158dec1a","body":"4","createdAt":"2026-11-23T10:54:59.609997896Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f/messages
correlation: qa-bd73eab8-404b-485f-8e0d-e0d942f10d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd73eab8-404b-485f-8e0d-e0d942f10d8f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd73eab8-404b-485f-8e0d-e0d942f10d8f
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

{"id":"msg_78604d75-28bf-4b5a-a1ee-ed29efb87612","conversationId":"cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f","sender":"qa-9982158dec1a","body":"5","createdAt":"2026-11-23T10:54:59.645786023Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-cad49cac-6cd8-42bd-8dc5-07405f458ab1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad49cac-6cd8-42bd-8dc5-07405f458ab1
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cad49cac-6cd8-42bd-8dc5-07405f458ab1
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

{"balance":0,"currency":"credits","accountId":"acc_50dfd5e5-492e-4b68-bc97-177196a9b23b"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-fc67874c-3acd-4e7a-bc78-016caa05dda3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc67874c-3acd-4e7a-bc78-016caa05dda3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4a3057759c6c","subject":"One more","message":"Hi"}

--- response: 402 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc67874c-3acd-4e7a-bc78-016caa05dda3
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-fc67874c-3acd-4e7a-bc78-016caa05dda3"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-fb013845-52a5-4ea1-8f0c-27c79fa03840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb013845-52a5-4ea1-8f0c-27c79fa03840
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb013845-52a5-4ea1-8f0c-27c79fa03840
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

{"items":[{"id":"led_7bb35250-4f40-45f2-815f-a64ae18129c2","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-23T10:54:59.389928834Z"},{"id":"led_d3500434-c659-4266-80b8-8f220a36822c","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_6b1828ff-bcbf-4a04-8f73-60ddd2712c4f","createdAt":"2026-11-23T10:54:59.502625281Z"},{"id":"led_8d00a5e7-0e55-4de1-ac49-edc971600aeb","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_43fac967-642c-46e2-8553-956a5c0ebae1","createdAt":"2026-11-23T10:54:59.535927654Z"},{"id":"led_190619f7-5007-4a88-839a-8d6deeb4c209","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_3cf71343-75f0-45c2-9f01-c276c4d61267","createdAt":"2026-11-23T10:54:59.577469817Z"},{"id":"led_bb520e12-c9e8-4a09-99c3-956d6e986a05","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_0d72f691-0a19-4adf-87fd-9f2d63c18108","createdAt":"2026-11-23T10:54:59.609988261Z"},{"id":"led_1f5c9065-90af-4c31-9382-37ca99b7fa56","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_78604d75-28bf-4b5a-a1ee-ed29efb87612","createdAt":"2026-11-23T10:54:59.645778291Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-aa6a479e-5785-4dc3-9655-8b705c0ef227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa6a479e-5785-4dc3-9655-8b705c0ef227
Content-Type: application/json

--- request body ---
{"handle":"qa-4a3057759c6c","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa6a479e-5785-4dc3-9655-8b705c0ef227
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb68941c-1541-4c53-a7ca-9011238a64c7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7b1c087-1566-47c7-a28f-96ecde15ab75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7b1c087-1566-47c7-a28f-96ecde15ab75
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7b1c087-1566-47c7-a28f-96ecde15ab75
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
correlation: qa-996a58ca-6d09-4b23-9e7d-d8578c163643

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-996a58ca-6d09-4b23-9e7d-d8578c163643
Content-Type: application/json

--- request body ---
{"handle":"qa-4a3057759c6c","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-996a58ca-6d09-4b23-9e7d-d8578c163643
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-996a58ca-6d09-4b23-9e7d-d8578c163643"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ca7f1f5-2b68-470d-9caf-f43141f17335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ca7f1f5-2b68-470d-9caf-f43141f17335
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ca7f1f5-2b68-470d-9caf-f43141f17335
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
correlation: qa-ad79a158-17e5-42f5-8986-e55cba6dea0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad79a158-17e5-42f5-8986-e55cba6dea0e
Content-Type: application/json

--- request body ---
{"handle":"qa-9982158dec1a","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad79a158-17e5-42f5-8986-e55cba6dea0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad79a158-17e5-42f5-8986-e55cba6dea0e"}
```
