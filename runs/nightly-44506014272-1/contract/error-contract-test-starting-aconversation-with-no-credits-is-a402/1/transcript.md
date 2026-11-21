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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-96456743-bb86-4416-bca9-a14d5b74abdb` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-ddc5a5d2-4a57-4b36-a2f3-f5f7888fed9b` |
| 3 | `POST /v1/auth/token` | 200 | 63 | `qa-f46f4889-65f5-4bbe-a167-d136d848e42e` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-bfa47d03-d83b-424d-add0-bb402f365b54` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 32 | `qa-f69f954c-e2d9-4553-8231-4178a548234f` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-5ee3c85d-b46e-40dc-9bab-729dba9a8448` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-178337e2-19c4-46af-a0da-1bf40034dd39` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-536a5af9-10fc-4587-9ce7-bf47949002ba` |
| 9 | `GET /v1/credits/balance` | 200 | 17 | `qa-ddecbd7c-427d-46c5-b6c9-5da0cafd0d4b` |
| 10 | `POST /v1/conversations` | 402 | 28 | `qa-b4c9c79b-f897-4941-9c83-bad38e17540c` |
| 11 | `GET /v1/credits/ledger` | 200 | 32 | `qa-42cf1a6c-e299-4d8d-b1cb-d55e2fb783a6` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-e46a6437-7ed6-41a2-8c16-77534acc52e9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-bb9075bb-10a7-4d85-9910-c52bce114a3d` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-ce13f714-1c07-41fe-a19d-07256a41c450` |
| 15 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-af9f9b87-59a3-4b58-8d27-cbe04f1eadb6` |
| 16 | `POST /v1/auth/token` | 401 | 21 | `qa-05ec0007-4f1b-46a0-a14d-3127fea601d2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-96456743-bb86-4416-bca9-a14d5b74abdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96456743-bb86-4416-bca9-a14d5b74abdb
Content-Type: application/json

--- request body ---
{"handle":"qa-bcddb4664f78","displayName":"QA bcddb4664f78","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-96456743-bb86-4416-bca9-a14d5b74abdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 6
Location: /v1/accounts/qa-bcddb4664f78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f92e276-4ab7-4146-9170-cb3a0bfe1bde","handle":"qa-bcddb4664f78","displayName":"QA bcddb4664f78","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.324231439Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ddc5a5d2-4a57-4b36-a2f3-f5f7888fed9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc5a5d2-4a57-4b36-a2f3-f5f7888fed9b
Content-Type: application/json

--- request body ---
{"handle":"qa-c036623e3a3b","displayName":"QA c036623e3a3b","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddc5a5d2-4a57-4b36-a2f3-f5f7888fed9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 6
Location: /v1/accounts/qa-c036623e3a3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9c00419-7fbe-4af1-872c-d8b0161e7017","handle":"qa-c036623e3a3b","displayName":"QA c036623e3a3b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.388958774Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f46f4889-65f5-4bbe-a167-d136d848e42e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f46f4889-65f5-4bbe-a167-d136d848e42e
Content-Type: application/json

--- request body ---
{"handle":"qa-bcddb4664f78","password":"****"}

--- response: 200 in 63 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f46f4889-65f5-4bbe-a167-d136d848e42e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f92e276-4ab7-4146-9170-cb3a0bfe1bde"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bfa47d03-d83b-424d-add0-bb402f365b54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa47d03-d83b-424d-add0-bb402f365b54
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c036623e3a3b","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfa47d03-d83b-424d-add0-bb402f365b54
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
Location: /v1/conversations/cnv_096c74c6-93fb-48f7-87db-e45b9336ac90
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_096c74c6-93fb-48f7-87db-e45b9336ac90","subject":"Error contract","status":"open","region":"eu","participants":["qa-bcddb4664f78","qa-c036623e3a3b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.530521064Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_096c74c6-93fb-48f7-87db-e45b9336ac90/messages
correlation: qa-f69f954c-e2d9-4553-8231-4178a548234f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f69f954c-e2d9-4553-8231-4178a548234f
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f69f954c-e2d9-4553-8231-4178a548234f
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

{"id":"msg_133beb2d-c9ac-4997-b5d8-32eb0d6fe6da","conversationId":"cnv_096c74c6-93fb-48f7-87db-e45b9336ac90","sender":"qa-bcddb4664f78","body":"2","createdAt":"2026-11-19T10:29:26.589511721Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_096c74c6-93fb-48f7-87db-e45b9336ac90/messages
correlation: qa-5ee3c85d-b46e-40dc-9bab-729dba9a8448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ee3c85d-b46e-40dc-9bab-729dba9a8448
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ee3c85d-b46e-40dc-9bab-729dba9a8448
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

{"id":"msg_1c1f9e39-0bd0-47eb-929b-f7cf35f60867","conversationId":"cnv_096c74c6-93fb-48f7-87db-e45b9336ac90","sender":"qa-bcddb4664f78","body":"3","createdAt":"2026-11-19T10:29:26.641669406Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_096c74c6-93fb-48f7-87db-e45b9336ac90/messages
correlation: qa-178337e2-19c4-46af-a0da-1bf40034dd39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-178337e2-19c4-46af-a0da-1bf40034dd39
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-178337e2-19c4-46af-a0da-1bf40034dd39
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

{"id":"msg_958058a0-38c7-4cd0-b59e-edd5dcc3c667","conversationId":"cnv_096c74c6-93fb-48f7-87db-e45b9336ac90","sender":"qa-bcddb4664f78","body":"4","createdAt":"2026-11-19T10:29:26.671786502Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_096c74c6-93fb-48f7-87db-e45b9336ac90/messages
correlation: qa-536a5af9-10fc-4587-9ce7-bf47949002ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-536a5af9-10fc-4587-9ce7-bf47949002ba
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-536a5af9-10fc-4587-9ce7-bf47949002ba
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

{"id":"msg_129f6d63-13dc-4056-b040-48e2764629ae","conversationId":"cnv_096c74c6-93fb-48f7-87db-e45b9336ac90","sender":"qa-bcddb4664f78","body":"5","createdAt":"2026-11-19T10:29:26.719233130Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-ddecbd7c-427d-46c5-b6c9-5da0cafd0d4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddecbd7c-427d-46c5-b6c9-5da0cafd0d4b
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddecbd7c-427d-46c5-b6c9-5da0cafd0d4b
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

{"balance":0,"currency":"credits","accountId":"acc_9f92e276-4ab7-4146-9170-cb3a0bfe1bde"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-b4c9c79b-f897-4941-9c83-bad38e17540c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c9c79b-f897-4941-9c83-bad38e17540c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c036623e3a3b","subject":"One more","message":"Hi"}

--- response: 402 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4c9c79b-f897-4941-9c83-bad38e17540c
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-b4c9c79b-f897-4941-9c83-bad38e17540c"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-42cf1a6c-e299-4d8d-b1cb-d55e2fb783a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42cf1a6c-e299-4d8d-b1cb-d55e2fb783a6
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-42cf1a6c-e299-4d8d-b1cb-d55e2fb783a6
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

{"items":[{"id":"led_adfb9f08-9ade-427f-880b-993a2c05358e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-19T10:29:26.324244633Z"},{"id":"led_f611d4e5-02ee-4ea0-9cea-a3f3567241b3","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_096c74c6-93fb-48f7-87db-e45b9336ac90","createdAt":"2026-11-19T10:29:26.530508140Z"},{"id":"led_783ff8d7-69eb-4091-874c-394adee00778","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_133beb2d-c9ac-4997-b5d8-32eb0d6fe6da","createdAt":"2026-11-19T10:29:26.589499218Z"},{"id":"led_ba15c204-eb8d-476f-b4a3-ac2e68583cd6","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_1c1f9e39-0bd0-47eb-929b-f7cf35f60867","createdAt":"2026-11-19T10:29:26.641663284Z"},{"id":"led_30ec569d-7cb0-46d1-ac2b-b625df1d639d","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_958058a0-38c7-4cd0-b59e-edd5dcc3c667","createdAt":"2026-11-19T10:29:26.671775803Z"},{"id":"led_c16b9cb0-5281-4352-9f5d-8d3853e323af","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_129f6d63-13dc-4056-b040-48e2764629ae","createdAt":"2026-11-19T10:29:26.719222981Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e46a6437-7ed6-41a2-8c16-77534acc52e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e46a6437-7ed6-41a2-8c16-77534acc52e9
Content-Type: application/json

--- request body ---
{"handle":"qa-c036623e3a3b","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e46a6437-7ed6-41a2-8c16-77534acc52e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9c00419-7fbe-4af1-872c-d8b0161e7017"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb9075bb-10a7-4d85-9910-c52bce114a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb9075bb-10a7-4d85-9910-c52bce114a3d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb9075bb-10a7-4d85-9910-c52bce114a3d
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
correlation: qa-ce13f714-1c07-41fe-a19d-07256a41c450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce13f714-1c07-41fe-a19d-07256a41c450
Content-Type: application/json

--- request body ---
{"handle":"qa-c036623e3a3b","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce13f714-1c07-41fe-a19d-07256a41c450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce13f714-1c07-41fe-a19d-07256a41c450"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af9f9b87-59a3-4b58-8d27-cbe04f1eadb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af9f9b87-59a3-4b58-8d27-cbe04f1eadb6
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af9f9b87-59a3-4b58-8d27-cbe04f1eadb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 9
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-05ec0007-4f1b-46a0-a14d-3127fea601d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05ec0007-4f1b-46a0-a14d-3127fea601d2
Content-Type: application/json

--- request body ---
{"handle":"qa-bcddb4664f78","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05ec0007-4f1b-46a0-a14d-3127fea601d2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05ec0007-4f1b-46a0-a14d-3127fea601d2"}
```
