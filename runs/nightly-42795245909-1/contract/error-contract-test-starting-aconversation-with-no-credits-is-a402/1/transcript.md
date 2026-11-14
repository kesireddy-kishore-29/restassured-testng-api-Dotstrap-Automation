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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-7b5d9d12-3a55-4c38-b3ac-db31bb6bb754` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-4a6067d8-3e45-4910-8215-96d91edb9c52` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-818afd8e-8e39-4145-b9ad-798cf3dac9d1` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-ff85de8f-0678-4cef-887f-fb6dbc0d4da0` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-97da06be-977d-4bf8-a26e-df9d563ada43` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-decabc48-6cb4-422e-878c-7a3fdf56bac9` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-69a7491f-f623-47c4-a30e-0123c4686bd3` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-c19d1df4-1e72-4511-8b9c-84696032394f` |
| 9 | `GET /v1/credits/balance` | 200 | 32 | `qa-620a499d-7d11-4f4b-b4de-6c70c46f31f7` |
| 10 | `POST /v1/conversations` | 402 | 18 | `qa-21a63f1a-2848-4df3-bd63-220deb2d62fc` |
| 11 | `GET /v1/credits/ledger` | 200 | 7 | `qa-4f1c46c1-a1e5-4393-b415-d70d86a6758c` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-35675158-604d-4728-99f0-91f82b8f61b2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8a275285-46dc-4957-97dd-30370e47745f` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-1c7694de-5f23-4ba5-8aa1-88a9bac7b614` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ca6c46d9-7cce-4661-acc9-b9300c5e361e` |
| 16 | `POST /v1/auth/token` | 401 | 2 | `qa-cbbf1459-c2d7-4c3e-af7d-3e0053352841` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7b5d9d12-3a55-4c38-b3ac-db31bb6bb754

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b5d9d12-3a55-4c38-b3ac-db31bb6bb754
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca3bbb12702","displayName":"QA 8ca3bbb12702","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b5d9d12-3a55-4c38-b3ac-db31bb6bb754
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Location: /v1/accounts/qa-8ca3bbb12702
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5eb7bbb0-feef-49ae-a7c8-fe3b6e9fec93","handle":"qa-8ca3bbb12702","displayName":"QA 8ca3bbb12702","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.138525859Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4a6067d8-3e45-4910-8215-96d91edb9c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a6067d8-3e45-4910-8215-96d91edb9c52
Content-Type: application/json

--- request body ---
{"handle":"qa-574e90bbd107","displayName":"QA 574e90bbd107","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a6067d8-3e45-4910-8215-96d91edb9c52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Location: /v1/accounts/qa-574e90bbd107
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e905cd4-b505-4efb-b37e-748ac9499564","handle":"qa-574e90bbd107","displayName":"QA 574e90bbd107","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.207309368Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-818afd8e-8e39-4145-b9ad-798cf3dac9d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-818afd8e-8e39-4145-b9ad-798cf3dac9d1
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca3bbb12702","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-818afd8e-8e39-4145-b9ad-798cf3dac9d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5eb7bbb0-feef-49ae-a7c8-fe3b6e9fec93"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ff85de8f-0678-4cef-887f-fb6dbc0d4da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff85de8f-0678-4cef-887f-fb6dbc0d4da0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-574e90bbd107","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff85de8f-0678-4cef-887f-fb6dbc0d4da0
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
Location: /v1/conversations/cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ca3bbb12702","qa-574e90bbd107"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.266608488Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386/messages
correlation: qa-97da06be-977d-4bf8-a26e-df9d563ada43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97da06be-977d-4bf8-a26e-df9d563ada43
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-97da06be-977d-4bf8-a26e-df9d563ada43
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

{"id":"msg_a202b2fd-616a-48cf-9c18-c44ebbe02a99","conversationId":"cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386","sender":"qa-8ca3bbb12702","body":"2","createdAt":"2026-11-10T09:59:37.292279158Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386/messages
correlation: qa-decabc48-6cb4-422e-878c-7a3fdf56bac9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-decabc48-6cb4-422e-878c-7a3fdf56bac9
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-decabc48-6cb4-422e-878c-7a3fdf56bac9
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

{"id":"msg_abb0fbb9-3bbb-42aa-ad30-4aa1486107af","conversationId":"cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386","sender":"qa-8ca3bbb12702","body":"3","createdAt":"2026-11-10T09:59:37.322365814Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386/messages
correlation: qa-69a7491f-f623-47c4-a30e-0123c4686bd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69a7491f-f623-47c4-a30e-0123c4686bd3
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-69a7491f-f623-47c4-a30e-0123c4686bd3
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

{"id":"msg_f2bd3db0-13e6-4c91-852a-57a270cf0ae1","conversationId":"cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386","sender":"qa-8ca3bbb12702","body":"4","createdAt":"2026-11-10T09:59:37.351474433Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386/messages
correlation: qa-c19d1df4-1e72-4511-8b9c-84696032394f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c19d1df4-1e72-4511-8b9c-84696032394f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c19d1df4-1e72-4511-8b9c-84696032394f
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

{"id":"msg_425b8e2b-fc16-4975-8cf6-cffac6204be7","conversationId":"cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386","sender":"qa-8ca3bbb12702","body":"5","createdAt":"2026-11-10T09:59:37.372895978Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-620a499d-7d11-4f4b-b4de-6c70c46f31f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620a499d-7d11-4f4b-b4de-6c70c46f31f7
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-620a499d-7d11-4f4b-b4de-6c70c46f31f7
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

{"balance":0,"currency":"credits","accountId":"acc_5eb7bbb0-feef-49ae-a7c8-fe3b6e9fec93"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-21a63f1a-2848-4df3-bd63-220deb2d62fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a63f1a-2848-4df3-bd63-220deb2d62fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-574e90bbd107","subject":"One more","message":"Hi"}

--- response: 402 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21a63f1a-2848-4df3-bd63-220deb2d62fc
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-21a63f1a-2848-4df3-bd63-220deb2d62fc"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4f1c46c1-a1e5-4393-b415-d70d86a6758c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f1c46c1-a1e5-4393-b415-d70d86a6758c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f1c46c1-a1e5-4393-b415-d70d86a6758c
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

{"items":[{"id":"led_609bb7dd-b844-474d-8888-a0dfc68f1936","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-10T09:59:37.138535203Z"},{"id":"led_ad3fb5a0-e276-4743-9f11-ad727cee78af","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_7d7cc84b-0f86-4cc9-aab5-59d156206386","createdAt":"2026-11-10T09:59:37.266596300Z"},{"id":"led_ae16b1e7-72aa-4afd-b44c-a821e878380d","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_a202b2fd-616a-48cf-9c18-c44ebbe02a99","createdAt":"2026-11-10T09:59:37.292272488Z"},{"id":"led_393d6c49-bbb5-44af-a18b-d1b92e0dfc4b","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_abb0fbb9-3bbb-42aa-ad30-4aa1486107af","createdAt":"2026-11-10T09:59:37.322356921Z"},{"id":"led_e3d33c5e-808a-4a42-b3f2-974cf1f6635d","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_f2bd3db0-13e6-4c91-852a-57a270cf0ae1","createdAt":"2026-11-10T09:59:37.351466281Z"},{"id":"led_2053d6aa-edcd-4703-93a0-03f58ff96eac","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_425b8e2b-fc16-4975-8cf6-cffac6204be7","createdAt":"2026-11-10T09:59:37.372890731Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-35675158-604d-4728-99f0-91f82b8f61b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35675158-604d-4728-99f0-91f82b8f61b2
Content-Type: application/json

--- request body ---
{"handle":"qa-574e90bbd107","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-35675158-604d-4728-99f0-91f82b8f61b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e905cd4-b505-4efb-b37e-748ac9499564"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a275285-46dc-4957-97dd-30370e47745f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a275285-46dc-4957-97dd-30370e47745f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a275285-46dc-4957-97dd-30370e47745f
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
correlation: qa-1c7694de-5f23-4ba5-8aa1-88a9bac7b614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c7694de-5f23-4ba5-8aa1-88a9bac7b614
Content-Type: application/json

--- request body ---
{"handle":"qa-574e90bbd107","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c7694de-5f23-4ba5-8aa1-88a9bac7b614
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c7694de-5f23-4ba5-8aa1-88a9bac7b614"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca6c46d9-7cce-4661-acc9-b9300c5e361e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca6c46d9-7cce-4661-acc9-b9300c5e361e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca6c46d9-7cce-4661-acc9-b9300c5e361e
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
correlation: qa-cbbf1459-c2d7-4c3e-af7d-3e0053352841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbbf1459-c2d7-4c3e-af7d-3e0053352841
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca3bbb12702","password":"****"}

--- response: 401 in 2 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbbf1459-c2d7-4c3e-af7d-3e0053352841
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbbf1459-c2d7-4c3e-af7d-3e0053352841"}
```
