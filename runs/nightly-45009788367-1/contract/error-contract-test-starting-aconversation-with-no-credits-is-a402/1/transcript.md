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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-81b567da-e903-407f-941b-3a024f11902c` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-0623b013-409c-4894-ab9c-5695db3e44ed` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-0a87a021-abd0-419d-a507-cbced9161e18` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-42e95961-ef2b-4e7d-b497-4ce37c02bfd1` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-72e808a3-e8af-44b2-a7db-fdebdb273a3a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-b985704a-dcb9-45cc-8a0b-c18df19b25ee` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 40 | `qa-04d6e0d6-d5a0-4bdf-9ddf-f5144f9f2019` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-cc62f645-54b5-4b5f-83da-fde13430b811` |
| 9 | `GET /v1/credits/balance` | 200 | 9 | `qa-69aa9c8a-5224-4380-bbc5-33162580b7b4` |
| 10 | `POST /v1/conversations` | 402 | 9 | `qa-016c860a-9139-478a-9981-77d6a944db9f` |
| 11 | `GET /v1/credits/ledger` | 200 | 9 | `qa-c3ff1275-b2fb-47c2-ba1b-65e12d151349` |
| 12 | `POST /v1/auth/token` | 200 | 6 | `qa-976dd284-ee63-4393-9178-912c5e0f8ade` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-90b39cbf-8c80-4660-aeb7-06d6f712f45c` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-454b52aa-e20b-4dbb-85ce-06f16dad3700` |
| 15 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-1130384b-bd42-4855-a6b3-dceb4f31c125` |
| 16 | `POST /v1/auth/token` | 401 | 13 | `qa-f04a5ec0-df14-4876-a92d-fb6c548cb4c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81b567da-e903-407f-941b-3a024f11902c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b567da-e903-407f-941b-3a024f11902c
Content-Type: application/json

--- request body ---
{"handle":"qa-8c97ba45ee81","displayName":"QA 8c97ba45ee81","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-81b567da-e903-407f-941b-3a024f11902c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Location: /v1/accounts/qa-8c97ba45ee81
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc51aca4-57a4-40ff-b59e-d0b4218d1a8c","handle":"qa-8c97ba45ee81","displayName":"QA 8c97ba45ee81","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.890755015Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0623b013-409c-4894-ab9c-5695db3e44ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0623b013-409c-4894-ab9c-5695db3e44ed
Content-Type: application/json

--- request body ---
{"handle":"qa-097bf978c166","displayName":"QA 097bf978c166","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0623b013-409c-4894-ab9c-5695db3e44ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Location: /v1/accounts/qa-097bf978c166
X-Served-Region: eu
Content-Length: 181

{"id":"acc_279fc669-1b14-460b-8292-1a81176b872d","handle":"qa-097bf978c166","displayName":"QA 097bf978c166","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.931849450Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0a87a021-abd0-419d-a507-cbced9161e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a87a021-abd0-419d-a507-cbced9161e18
Content-Type: application/json

--- request body ---
{"handle":"qa-8c97ba45ee81","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a87a021-abd0-419d-a507-cbced9161e18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc51aca4-57a4-40ff-b59e-d0b4218d1a8c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-42e95961-ef2b-4e7d-b497-4ce37c02bfd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42e95961-ef2b-4e7d-b497-4ce37c02bfd1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-097bf978c166","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-42e95961-ef2b-4e7d-b497-4ce37c02bfd1
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
Location: /v1/conversations/cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2","subject":"Error contract","status":"open","region":"eu","participants":["qa-8c97ba45ee81","qa-097bf978c166"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.977180155Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2/messages
correlation: qa-72e808a3-e8af-44b2-a7db-fdebdb273a3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e808a3-e8af-44b2-a7db-fdebdb273a3a
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-72e808a3-e8af-44b2-a7db-fdebdb273a3a
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

{"id":"msg_7c333e29-ec3c-4af5-a39b-464b6c473455","conversationId":"cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2","sender":"qa-8c97ba45ee81","body":"2","createdAt":"2026-11-22T09:54:42.002305529Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2/messages
correlation: qa-b985704a-dcb9-45cc-8a0b-c18df19b25ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b985704a-dcb9-45cc-8a0b-c18df19b25ee
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b985704a-dcb9-45cc-8a0b-c18df19b25ee
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

{"id":"msg_7497824b-b0b4-4842-87ac-df958d2ea5e0","conversationId":"cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2","sender":"qa-8c97ba45ee81","body":"3","createdAt":"2026-11-22T09:54:42.018811432Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2/messages
correlation: qa-04d6e0d6-d5a0-4bdf-9ddf-f5144f9f2019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d6e0d6-d5a0-4bdf-9ddf-f5144f9f2019
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 40 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d6e0d6-d5a0-4bdf-9ddf-f5144f9f2019
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

{"id":"msg_d6f2fa2d-a969-4704-bd79-64dfc497dc75","conversationId":"cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2","sender":"qa-8c97ba45ee81","body":"4","createdAt":"2026-11-22T09:54:42.063323471Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2/messages
correlation: qa-cc62f645-54b5-4b5f-83da-fde13430b811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc62f645-54b5-4b5f-83da-fde13430b811
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc62f645-54b5-4b5f-83da-fde13430b811
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

{"id":"msg_45bb4df9-7ef0-4cd3-a6fa-0128b13fb73a","conversationId":"cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2","sender":"qa-8c97ba45ee81","body":"5","createdAt":"2026-11-22T09:54:42.095566946Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-69aa9c8a-5224-4380-bbc5-33162580b7b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69aa9c8a-5224-4380-bbc5-33162580b7b4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-69aa9c8a-5224-4380-bbc5-33162580b7b4
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

{"balance":0,"currency":"credits","accountId":"acc_cc51aca4-57a4-40ff-b59e-d0b4218d1a8c"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-016c860a-9139-478a-9981-77d6a944db9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-016c860a-9139-478a-9981-77d6a944db9f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-097bf978c166","subject":"One more","message":"Hi"}

--- response: 402 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-016c860a-9139-478a-9981-77d6a944db9f
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-016c860a-9139-478a-9981-77d6a944db9f"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c3ff1275-b2fb-47c2-ba1b-65e12d151349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3ff1275-b2fb-47c2-ba1b-65e12d151349
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3ff1275-b2fb-47c2-ba1b-65e12d151349
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

{"items":[{"id":"led_1d2dcb7d-0d81-453c-b3d9-f6b46a742292","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-22T09:54:41.890771540Z"},{"id":"led_cd1e18f2-8c58-42c0-86d4-6c4ff8f12005","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_b5f89080-a8b3-4a0b-b1ed-4678633544e2","createdAt":"2026-11-22T09:54:41.977171422Z"},{"id":"led_d9816094-78f2-43a5-92f6-b2a8097b15a5","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_7c333e29-ec3c-4af5-a39b-464b6c473455","createdAt":"2026-11-22T09:54:42.002299770Z"},{"id":"led_ad4e67b1-bfef-47a1-82cf-6ccccb2d4f41","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_7497824b-b0b4-4842-87ac-df958d2ea5e0","createdAt":"2026-11-22T09:54:42.018805884Z"},{"id":"led_79b6b91e-b03e-4d8a-b6a1-a1794aff5dd8","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_d6f2fa2d-a969-4704-bd79-64dfc497dc75","createdAt":"2026-11-22T09:54:42.063317092Z"},{"id":"led_cf3dbf71-ca0e-4ae9-bd0b-c0786d235bcc","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_45bb4df9-7ef0-4cd3-a6fa-0128b13fb73a","createdAt":"2026-11-22T09:54:42.095560296Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-976dd284-ee63-4393-9178-912c5e0f8ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-976dd284-ee63-4393-9178-912c5e0f8ade
Content-Type: application/json

--- request body ---
{"handle":"qa-097bf978c166","password":"****"}

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-976dd284-ee63-4393-9178-912c5e0f8ade
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_279fc669-1b14-460b-8292-1a81176b872d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90b39cbf-8c80-4660-aeb7-06d6f712f45c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90b39cbf-8c80-4660-aeb7-06d6f712f45c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90b39cbf-8c80-4660-aeb7-06d6f712f45c
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
correlation: qa-454b52aa-e20b-4dbb-85ce-06f16dad3700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-454b52aa-e20b-4dbb-85ce-06f16dad3700
Content-Type: application/json

--- request body ---
{"handle":"qa-097bf978c166","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-454b52aa-e20b-4dbb-85ce-06f16dad3700
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-454b52aa-e20b-4dbb-85ce-06f16dad3700"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1130384b-bd42-4855-a6b3-dceb4f31c125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1130384b-bd42-4855-a6b3-dceb4f31c125
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1130384b-bd42-4855-a6b3-dceb4f31c125
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
correlation: qa-f04a5ec0-df14-4876-a92d-fb6c548cb4c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f04a5ec0-df14-4876-a92d-fb6c548cb4c8
Content-Type: application/json

--- request body ---
{"handle":"qa-8c97ba45ee81","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f04a5ec0-df14-4876-a92d-fb6c548cb4c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f04a5ec0-df14-4876-a92d-fb6c548cb4c8"}
```
