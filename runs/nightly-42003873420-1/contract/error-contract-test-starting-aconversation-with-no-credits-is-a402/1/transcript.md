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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-a95a7621-24d4-4f4f-bf0b-be6c385eacb3` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-0f6c2fe6-1c31-4d8d-a5af-9a7b30446bf7` |
| 3 | `POST /v1/auth/token` | 200 | 72 | `qa-120455e2-7c55-4b7e-8f9c-37ece28ca2ff` |
| 4 | `POST /v1/conversations` | 201 | 43 | `qa-b56d4ccb-5c4f-4987-bade-b450feed88ca` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 30 | `qa-21cd4e44-52eb-4559-afbf-b07c55ae0fb5` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-219b13d6-b00f-4b17-bfef-67ce1a6df4f0` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-caba65fc-a847-4a9d-908d-08957ac97ad8` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-81dae3b2-57c4-445c-bf19-a5e51008513c` |
| 9 | `GET /v1/credits/balance` | 200 | 24 | `qa-6eae001e-994b-40b6-9cd5-6c0a9f5e82ea` |
| 10 | `POST /v1/conversations` | 402 | 15 | `qa-756a9635-7a23-4a49-803e-4bdb1d99b1d7` |
| 11 | `GET /v1/credits/ledger` | 200 | 15 | `qa-425bc8f7-98d1-48a9-ae2e-b07f467a9b25` |
| 12 | `POST /v1/auth/token` | 200 | 13 | `qa-0ecdca0a-6920-4700-915e-2f73b5b9deb5` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4bb3b670-47be-450f-8c0f-07233a6448a7` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-f2eb29b2-a3f1-43da-b57f-1c8cd7f5d829` |
| 15 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-1ee3d6a8-ac60-4cb0-8694-28aaa7efcb25` |
| 16 | `POST /v1/auth/token` | 401 | 21 | `qa-eded0801-af53-4444-a999-ee81b66fb203` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a95a7621-24d4-4f4f-bf0b-be6c385eacb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a95a7621-24d4-4f4f-bf0b-be6c385eacb3
Content-Type: application/json

--- request body ---
{"handle":"qa-78b45d108dab","displayName":"QA 78b45d108dab","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a95a7621-24d4-4f4f-bf0b-be6c385eacb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Location: /v1/accounts/qa-78b45d108dab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5aaf0004-e477-4728-a2b3-914e0a4b61b9","handle":"qa-78b45d108dab","displayName":"QA 78b45d108dab","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.308442985Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f6c2fe6-1c31-4d8d-a5af-9a7b30446bf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f6c2fe6-1c31-4d8d-a5af-9a7b30446bf7
Content-Type: application/json

--- request body ---
{"handle":"qa-7be86def69d5","displayName":"QA 7be86def69d5","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f6c2fe6-1c31-4d8d-a5af-9a7b30446bf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Location: /v1/accounts/qa-7be86def69d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bbd0516c-76b5-48fd-aee3-9402c6012d26","handle":"qa-7be86def69d5","displayName":"QA 7be86def69d5","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.371191639Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-120455e2-7c55-4b7e-8f9c-37ece28ca2ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-120455e2-7c55-4b7e-8f9c-37ece28ca2ff
Content-Type: application/json

--- request body ---
{"handle":"qa-78b45d108dab","password":"****"}

--- response: 200 in 72 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-120455e2-7c55-4b7e-8f9c-37ece28ca2ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5aaf0004-e477-4728-a2b3-914e0a4b61b9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b56d4ccb-5c4f-4987-bade-b450feed88ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b56d4ccb-5c4f-4987-bade-b450feed88ca
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7be86def69d5","subject":"Error contract","message":"Hi"}

--- response: 201 in 43 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b56d4ccb-5c4f-4987-bade-b450feed88ca
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
Location: /v1/conversations/cnv_833c62f3-abb4-4686-be51-55e5364a0198
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_833c62f3-abb4-4686-be51-55e5364a0198","subject":"Error contract","status":"open","region":"eu","participants":["qa-78b45d108dab","qa-7be86def69d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.528866679Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_833c62f3-abb4-4686-be51-55e5364a0198/messages
correlation: qa-21cd4e44-52eb-4559-afbf-b07c55ae0fb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21cd4e44-52eb-4559-afbf-b07c55ae0fb5
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-21cd4e44-52eb-4559-afbf-b07c55ae0fb5
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

{"id":"msg_17feb34b-3351-4743-bf7a-2c5870c43b4a","conversationId":"cnv_833c62f3-abb4-4686-be51-55e5364a0198","sender":"qa-78b45d108dab","body":"2","createdAt":"2026-11-05T09:37:56.580435210Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_833c62f3-abb4-4686-be51-55e5364a0198/messages
correlation: qa-219b13d6-b00f-4b17-bfef-67ce1a6df4f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219b13d6-b00f-4b17-bfef-67ce1a6df4f0
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-219b13d6-b00f-4b17-bfef-67ce1a6df4f0
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

{"id":"msg_b4ebe3ba-ebd8-4434-98bf-52e61e18d0a2","conversationId":"cnv_833c62f3-abb4-4686-be51-55e5364a0198","sender":"qa-78b45d108dab","body":"3","createdAt":"2026-11-05T09:37:56.613209303Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_833c62f3-abb4-4686-be51-55e5364a0198/messages
correlation: qa-caba65fc-a847-4a9d-908d-08957ac97ad8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caba65fc-a847-4a9d-908d-08957ac97ad8
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-caba65fc-a847-4a9d-908d-08957ac97ad8
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

{"id":"msg_a0c42cfa-eb8e-466a-975d-9a1ce46189c7","conversationId":"cnv_833c62f3-abb4-4686-be51-55e5364a0198","sender":"qa-78b45d108dab","body":"4","createdAt":"2026-11-05T09:37:56.633188026Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_833c62f3-abb4-4686-be51-55e5364a0198/messages
correlation: qa-81dae3b2-57c4-445c-bf19-a5e51008513c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81dae3b2-57c4-445c-bf19-a5e51008513c
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-81dae3b2-57c4-445c-bf19-a5e51008513c
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

{"id":"msg_bc7ca813-5233-468e-99c9-b2ffa6937b2e","conversationId":"cnv_833c62f3-abb4-4686-be51-55e5364a0198","sender":"qa-78b45d108dab","body":"5","createdAt":"2026-11-05T09:37:56.661213147Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-6eae001e-994b-40b6-9cd5-6c0a9f5e82ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eae001e-994b-40b6-9cd5-6c0a9f5e82ea
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eae001e-994b-40b6-9cd5-6c0a9f5e82ea
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

{"balance":0,"currency":"credits","accountId":"acc_5aaf0004-e477-4728-a2b3-914e0a4b61b9"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-756a9635-7a23-4a49-803e-4bdb1d99b1d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-756a9635-7a23-4a49-803e-4bdb1d99b1d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7be86def69d5","subject":"One more","message":"Hi"}

--- response: 402 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-756a9635-7a23-4a49-803e-4bdb1d99b1d7
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-756a9635-7a23-4a49-803e-4bdb1d99b1d7"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-425bc8f7-98d1-48a9-ae2e-b07f467a9b25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-425bc8f7-98d1-48a9-ae2e-b07f467a9b25
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-425bc8f7-98d1-48a9-ae2e-b07f467a9b25
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

{"items":[{"id":"led_d08a3eae-ee42-4bc7-a96c-9a40042f0401","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-05T09:37:56.308453475Z"},{"id":"led_22882483-1ec4-46f2-876a-5a474363806f","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_833c62f3-abb4-4686-be51-55e5364a0198","createdAt":"2026-11-05T09:37:56.528854566Z"},{"id":"led_efba5abd-7c8f-49e2-a0bf-497f6aa608d3","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_17feb34b-3351-4743-bf7a-2c5870c43b4a","createdAt":"2026-11-05T09:37:56.580422386Z"},{"id":"led_98bc3527-90b7-4994-ae11-d590bae20bbd","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_b4ebe3ba-ebd8-4434-98bf-52e61e18d0a2","createdAt":"2026-11-05T09:37:56.613198022Z"},{"id":"led_46f79d04-c4b4-4091-b615-b177cf809c7e","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_a0c42cfa-eb8e-466a-975d-9a1ce46189c7","createdAt":"2026-11-05T09:37:56.633179320Z"},{"id":"led_0dacdc61-deab-4d5a-a0cb-3fe2e4a4038b","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_bc7ca813-5233-468e-99c9-b2ffa6937b2e","createdAt":"2026-11-05T09:37:56.661173713Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-0ecdca0a-6920-4700-915e-2f73b5b9deb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ecdca0a-6920-4700-915e-2f73b5b9deb5
Content-Type: application/json

--- request body ---
{"handle":"qa-7be86def69d5","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ecdca0a-6920-4700-915e-2f73b5b9deb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bbd0516c-76b5-48fd-aee3-9402c6012d26"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4bb3b670-47be-450f-8c0f-07233a6448a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bb3b670-47be-450f-8c0f-07233a6448a7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4bb3b670-47be-450f-8c0f-07233a6448a7
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
correlation: qa-f2eb29b2-a3f1-43da-b57f-1c8cd7f5d829

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2eb29b2-a3f1-43da-b57f-1c8cd7f5d829
Content-Type: application/json

--- request body ---
{"handle":"qa-7be86def69d5","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2eb29b2-a3f1-43da-b57f-1c8cd7f5d829
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2eb29b2-a3f1-43da-b57f-1c8cd7f5d829"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ee3d6a8-ac60-4cb0-8694-28aaa7efcb25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ee3d6a8-ac60-4cb0-8694-28aaa7efcb25
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ee3d6a8-ac60-4cb0-8694-28aaa7efcb25
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
correlation: qa-eded0801-af53-4444-a999-ee81b66fb203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eded0801-af53-4444-a999-ee81b66fb203
Content-Type: application/json

--- request body ---
{"handle":"qa-78b45d108dab","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eded0801-af53-4444-a999-ee81b66fb203
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eded0801-af53-4444-a999-ee81b66fb203"}
```
