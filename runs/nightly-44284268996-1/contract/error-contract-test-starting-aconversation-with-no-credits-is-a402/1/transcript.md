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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-a4cef2bf-af82-4510-b30d-980c41f793c6` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-d6fd4268-0ea5-4439-bbb3-ebeeb1712ffb` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-051e4ec4-195d-43dc-8b08-a2a704ec1d63` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-1d7bc428-5ce0-4136-803d-5f5820ce4796` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 37 | `qa-677d1ab5-85d5-4ed6-bd49-34343bfef648` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-8d607e3b-d23c-436d-9f77-d43bf5a2e0f8` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-61dbf556-af3b-4bba-977c-bfdcbcda9f7c` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-bb0cbc8a-bfb0-469f-abbf-fd5798ce2e95` |
| 9 | `GET /v1/credits/balance` | 200 | 8 | `qa-49b43e07-2632-4387-b10e-38170975ec37` |
| 10 | `POST /v1/conversations` | 402 | 12 | `qa-ddd61d7f-8280-40ca-9846-1f2237225038` |
| 11 | `GET /v1/credits/ledger` | 200 | 14 | `qa-77deea2c-786e-4e53-b4bf-172eaa70eac9` |
| 12 | `POST /v1/auth/token` | 200 | 27 | `qa-bc357abc-4d7b-4fbf-848b-17449e15003c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9b331175-76cb-48a7-a034-91ef7b5f926d` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-83e0e7b0-fe20-44ad-a744-ebfdf2d114e1` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-eaf450b4-a189-4d52-9602-5f869593f10c` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-53903c61-f0aa-48eb-af12-55cc71343199` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4cef2bf-af82-4510-b30d-980c41f793c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4cef2bf-af82-4510-b30d-980c41f793c6
Content-Type: application/json

--- request body ---
{"handle":"qa-e6bdd7bce302","displayName":"QA e6bdd7bce302","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4cef2bf-af82-4510-b30d-980c41f793c6
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
Location: /v1/accounts/qa-e6bdd7bce302
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43b2d938-5243-4ea2-bc76-ba8a2c150458","handle":"qa-e6bdd7bce302","displayName":"QA e6bdd7bce302","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.350727672Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d6fd4268-0ea5-4439-bbb3-ebeeb1712ffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6fd4268-0ea5-4439-bbb3-ebeeb1712ffb
Content-Type: application/json

--- request body ---
{"handle":"qa-edfc17f4d529","displayName":"QA edfc17f4d529","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6fd4268-0ea5-4439-bbb3-ebeeb1712ffb
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
Location: /v1/accounts/qa-edfc17f4d529
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf00ec3e-4159-4f9d-aaff-e8d19d47569c","handle":"qa-edfc17f4d529","displayName":"QA edfc17f4d529","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.369076095Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-051e4ec4-195d-43dc-8b08-a2a704ec1d63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-051e4ec4-195d-43dc-8b08-a2a704ec1d63
Content-Type: application/json

--- request body ---
{"handle":"qa-e6bdd7bce302","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-051e4ec4-195d-43dc-8b08-a2a704ec1d63
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43b2d938-5243-4ea2-bc76-ba8a2c150458"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1d7bc428-5ce0-4136-803d-5f5820ce4796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7bc428-5ce0-4136-803d-5f5820ce4796
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-edfc17f4d529","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d7bc428-5ce0-4136-803d-5f5820ce4796
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
Location: /v1/conversations/cnv_565bffce-56dc-471b-9d68-f18a9ae0e131
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_565bffce-56dc-471b-9d68-f18a9ae0e131","subject":"Error contract","status":"open","region":"eu","participants":["qa-e6bdd7bce302","qa-edfc17f4d529"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.408991147Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_565bffce-56dc-471b-9d68-f18a9ae0e131/messages
correlation: qa-677d1ab5-85d5-4ed6-bd49-34343bfef648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-677d1ab5-85d5-4ed6-bd49-34343bfef648
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 37 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-677d1ab5-85d5-4ed6-bd49-34343bfef648
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

{"id":"msg_92467ee8-f91d-4c8a-8e34-99a901acf728","conversationId":"cnv_565bffce-56dc-471b-9d68-f18a9ae0e131","sender":"qa-e6bdd7bce302","body":"2","createdAt":"2026-11-18T10:19:52.468977744Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_565bffce-56dc-471b-9d68-f18a9ae0e131/messages
correlation: qa-8d607e3b-d23c-436d-9f77-d43bf5a2e0f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d607e3b-d23c-436d-9f77-d43bf5a2e0f8
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d607e3b-d23c-436d-9f77-d43bf5a2e0f8
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

{"id":"msg_f5ac8523-561c-46c2-b797-4f63a3ea7d1e","conversationId":"cnv_565bffce-56dc-471b-9d68-f18a9ae0e131","sender":"qa-e6bdd7bce302","body":"3","createdAt":"2026-11-18T10:19:52.487168686Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_565bffce-56dc-471b-9d68-f18a9ae0e131/messages
correlation: qa-61dbf556-af3b-4bba-977c-bfdcbcda9f7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61dbf556-af3b-4bba-977c-bfdcbcda9f7c
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-61dbf556-af3b-4bba-977c-bfdcbcda9f7c
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

{"id":"msg_e23b26bc-4c68-47f5-b5ef-13bb558461b6","conversationId":"cnv_565bffce-56dc-471b-9d68-f18a9ae0e131","sender":"qa-e6bdd7bce302","body":"4","createdAt":"2026-11-18T10:19:52.501343367Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_565bffce-56dc-471b-9d68-f18a9ae0e131/messages
correlation: qa-bb0cbc8a-bfb0-469f-abbf-fd5798ce2e95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb0cbc8a-bfb0-469f-abbf-fd5798ce2e95
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb0cbc8a-bfb0-469f-abbf-fd5798ce2e95
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

{"id":"msg_20e1032a-e824-4db2-af07-628de903ae8f","conversationId":"cnv_565bffce-56dc-471b-9d68-f18a9ae0e131","sender":"qa-e6bdd7bce302","body":"5","createdAt":"2026-11-18T10:19:52.521402495Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-49b43e07-2632-4387-b10e-38170975ec37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49b43e07-2632-4387-b10e-38170975ec37
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-49b43e07-2632-4387-b10e-38170975ec37
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

{"balance":0,"currency":"credits","accountId":"acc_43b2d938-5243-4ea2-bc76-ba8a2c150458"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-ddd61d7f-8280-40ca-9846-1f2237225038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddd61d7f-8280-40ca-9846-1f2237225038
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-edfc17f4d529","subject":"One more","message":"Hi"}

--- response: 402 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddd61d7f-8280-40ca-9846-1f2237225038
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-ddd61d7f-8280-40ca-9846-1f2237225038"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-77deea2c-786e-4e53-b4bf-172eaa70eac9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77deea2c-786e-4e53-b4bf-172eaa70eac9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-77deea2c-786e-4e53-b4bf-172eaa70eac9
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

{"items":[{"id":"led_2713153a-0141-4599-8269-dbd8a48d9e8e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-18T10:19:52.350743947Z"},{"id":"led_c5a1dd0c-1668-4e6c-a38b-e686aca52d70","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_565bffce-56dc-471b-9d68-f18a9ae0e131","createdAt":"2026-11-18T10:19:52.408984106Z"},{"id":"led_65315f2e-a80d-4a69-b439-c441abb66683","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_92467ee8-f91d-4c8a-8e34-99a901acf728","createdAt":"2026-11-18T10:19:52.468964143Z"},{"id":"led_3808cfb3-e7c2-4349-a75e-1171594cb471","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_f5ac8523-561c-46c2-b797-4f63a3ea7d1e","createdAt":"2026-11-18T10:19:52.487160614Z"},{"id":"led_baddb9ab-6f1f-4308-988a-bbe2cb51f82b","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_e23b26bc-4c68-47f5-b5ef-13bb558461b6","createdAt":"2026-11-18T10:19:52.501324319Z"},{"id":"led_20ae1c6e-40fa-44e3-8a22-2ae3864f5187","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_20e1032a-e824-4db2-af07-628de903ae8f","createdAt":"2026-11-18T10:19:52.521392220Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-bc357abc-4d7b-4fbf-848b-17449e15003c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc357abc-4d7b-4fbf-848b-17449e15003c
Content-Type: application/json

--- request body ---
{"handle":"qa-edfc17f4d529","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc357abc-4d7b-4fbf-848b-17449e15003c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf00ec3e-4159-4f9d-aaff-e8d19d47569c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b331175-76cb-48a7-a034-91ef7b5f926d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b331175-76cb-48a7-a034-91ef7b5f926d
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b331175-76cb-48a7-a034-91ef7b5f926d
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
correlation: qa-83e0e7b0-fe20-44ad-a744-ebfdf2d114e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e0e7b0-fe20-44ad-a744-ebfdf2d114e1
Content-Type: application/json

--- request body ---
{"handle":"qa-edfc17f4d529","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83e0e7b0-fe20-44ad-a744-ebfdf2d114e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83e0e7b0-fe20-44ad-a744-ebfdf2d114e1"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eaf450b4-a189-4d52-9602-5f869593f10c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaf450b4-a189-4d52-9602-5f869593f10c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eaf450b4-a189-4d52-9602-5f869593f10c
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
correlation: qa-53903c61-f0aa-48eb-af12-55cc71343199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53903c61-f0aa-48eb-af12-55cc71343199
Content-Type: application/json

--- request body ---
{"handle":"qa-e6bdd7bce302","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53903c61-f0aa-48eb-af12-55cc71343199
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53903c61-f0aa-48eb-af12-55cc71343199"}
```
