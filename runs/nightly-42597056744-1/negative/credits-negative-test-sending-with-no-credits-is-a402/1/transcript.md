# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-f69583a9-9a82-4e4e-9247-ee7d131ac5a2` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-610b64d8-6d34-4ec3-beae-11ba8e1fdf7c` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-72058c8e-5d07-4867-8703-11b0498709a8` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-3522e725-ca6a-49db-bf60-876d0726b27b` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-896b9db7-dcfe-48c3-82df-bf19b2018472` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-22d8eda7-4f54-4334-abf6-97ca44188114` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-8917ea3a-bba7-4721-8d08-e7fdfda25ffa` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-b7a7b4c2-a6a0-45d4-a4cd-65cf1b189684` |
| 9 | `GET /v1/credits/balance` | 200 | 14 | `qa-18591d64-73a6-450f-ac6a-4666c468f135` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 11 | `qa-2ecd1fea-3bc8-4984-ad02-fcc4b49beafc` |
| 11 | `GET /v1/credits/ledger` | 200 | 11 | `qa-75a6424d-7cff-4970-a445-45a3bd4bb566` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-0a231f46-dc57-4a27-af3d-d9e722481be9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-4e7b67b0-35c2-48c4-be50-a696151910ea` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-b4ddffda-efc0-45e7-b451-7e6fbb136757` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-14925355-7988-4b61-ab0d-411a761cb64a` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-48ef5ec3-d7b6-46de-aaa3-40d0a9a72552` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f69583a9-9a82-4e4e-9247-ee7d131ac5a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f69583a9-9a82-4e4e-9247-ee7d131ac5a2
Content-Type: application/json

--- request body ---
{"handle":"qa-41b04f310409","displayName":"QA 41b04f310409","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f69583a9-9a82-4e4e-9247-ee7d131ac5a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-41b04f310409
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68dec765-5f84-4baf-9e8e-e581bb5a8b06","handle":"qa-41b04f310409","displayName":"QA 41b04f310409","region":"eu","role":"user","createdAt":"2026-11-09T09:55:56.786256741Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-610b64d8-6d34-4ec3-beae-11ba8e1fdf7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-610b64d8-6d34-4ec3-beae-11ba8e1fdf7c
Content-Type: application/json

--- request body ---
{"handle":"qa-a26d9403d011","displayName":"QA a26d9403d011","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-610b64d8-6d34-4ec3-beae-11ba8e1fdf7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-a26d9403d011
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d62cb86c-87c3-4bcc-8b41-d6aab73953aa","handle":"qa-a26d9403d011","displayName":"QA a26d9403d011","region":"eu","role":"user","createdAt":"2026-11-09T09:55:56.836301834Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-72058c8e-5d07-4867-8703-11b0498709a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72058c8e-5d07-4867-8703-11b0498709a8
Content-Type: application/json

--- request body ---
{"handle":"qa-41b04f310409","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-72058c8e-5d07-4867-8703-11b0498709a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68dec765-5f84-4baf-9e8e-e581bb5a8b06"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3522e725-ca6a-49db-bf60-876d0726b27b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3522e725-ca6a-49db-bf60-876d0726b27b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a26d9403d011","subject":"Many messages","message":"1"}

--- response: 201 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3522e725-ca6a-49db-bf60-876d0726b27b
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
Location: /v1/conversations/cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49","subject":"Many messages","status":"open","region":"eu","participants":["qa-41b04f310409","qa-a26d9403d011"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:55:56.891602423Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49/messages
correlation: qa-896b9db7-dcfe-48c3-82df-bf19b2018472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-896b9db7-dcfe-48c3-82df-bf19b2018472
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-896b9db7-dcfe-48c3-82df-bf19b2018472
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

{"id":"msg_30e8c11a-9bef-47f8-a6c4-3dec7b4e6925","conversationId":"cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49","sender":"qa-41b04f310409","body":"2","createdAt":"2026-11-09T09:55:56.919183148Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49/messages
correlation: qa-22d8eda7-4f54-4334-abf6-97ca44188114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22d8eda7-4f54-4334-abf6-97ca44188114
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-22d8eda7-4f54-4334-abf6-97ca44188114
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

{"id":"msg_82b886dd-cae0-47e9-8151-fda2ac19685d","conversationId":"cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49","sender":"qa-41b04f310409","body":"3","createdAt":"2026-11-09T09:55:56.957019897Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49/messages
correlation: qa-8917ea3a-bba7-4721-8d08-e7fdfda25ffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8917ea3a-bba7-4721-8d08-e7fdfda25ffa
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8917ea3a-bba7-4721-8d08-e7fdfda25ffa
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

{"id":"msg_6b60fed9-911b-4ee0-82ea-278c5da639a5","conversationId":"cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49","sender":"qa-41b04f310409","body":"4","createdAt":"2026-11-09T09:55:56.983369986Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49/messages
correlation: qa-b7a7b4c2-a6a0-45d4-a4cd-65cf1b189684

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7a7b4c2-a6a0-45d4-a4cd-65cf1b189684
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7a7b4c2-a6a0-45d4-a4cd-65cf1b189684
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

{"id":"msg_938cc2f9-6e34-4709-8bbe-dea966bfd432","conversationId":"cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49","sender":"qa-41b04f310409","body":"5","createdAt":"2026-11-09T09:55:57.000925087Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-18591d64-73a6-450f-ac6a-4666c468f135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18591d64-73a6-450f-ac6a-4666c468f135
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-18591d64-73a6-450f-ac6a-4666c468f135
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

{"balance":0,"currency":"credits","accountId":"acc_68dec765-5f84-4baf-9e8e-e581bb5a8b06"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49/messages
correlation: qa-2ecd1fea-3bc8-4984-ad02-fcc4b49beafc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ecd1fea-3bc8-4984-ad02-fcc4b49beafc
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ecd1fea-3bc8-4984-ad02-fcc4b49beafc
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
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49/messages","correlationId":"qa-2ecd1fea-3bc8-4984-ad02-fcc4b49beafc"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-75a6424d-7cff-4970-a445-45a3bd4bb566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a6424d-7cff-4970-a445-45a3bd4bb566
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-75a6424d-7cff-4970-a445-45a3bd4bb566
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

{"items":[{"id":"led_ff35a2ee-ca98-4912-91fc-a9360199db44","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-09T09:55:56.786268579Z"},{"id":"led_5447503a-6f5c-4fda-aa83-832a3b983412","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_5f7e7433-fef7-45d7-9044-be6dc456ee49","createdAt":"2026-11-09T09:55:56.891571667Z"},{"id":"led_d98bab73-62f4-4669-a510-ee2746c58f73","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_30e8c11a-9bef-47f8-a6c4-3dec7b4e6925","createdAt":"2026-11-09T09:55:56.919170690Z"},{"id":"led_3fa956b3-d766-4fe8-80a7-3b5aff7aecc6","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_82b886dd-cae0-47e9-8151-fda2ac19685d","createdAt":"2026-11-09T09:55:56.956991475Z"},{"id":"led_7f93b3ae-ae43-428a-b263-726faec71427","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_6b60fed9-911b-4ee0-82ea-278c5da639a5","createdAt":"2026-11-09T09:55:56.983326241Z"},{"id":"led_c25c73cb-1203-42ac-8386-f6a5649fd208","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_938cc2f9-6e34-4709-8bbe-dea966bfd432","createdAt":"2026-11-09T09:55:57.000883416Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-0a231f46-dc57-4a27-af3d-d9e722481be9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a231f46-dc57-4a27-af3d-d9e722481be9
Content-Type: application/json

--- request body ---
{"handle":"qa-a26d9403d011","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a231f46-dc57-4a27-af3d-d9e722481be9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d62cb86c-87c3-4bcc-8b41-d6aab73953aa"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e7b67b0-35c2-48c4-be50-a696151910ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e7b67b0-35c2-48c4-be50-a696151910ea
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e7b67b0-35c2-48c4-be50-a696151910ea
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
correlation: qa-b4ddffda-efc0-45e7-b451-7e6fbb136757

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4ddffda-efc0-45e7-b451-7e6fbb136757
Content-Type: application/json

--- request body ---
{"handle":"qa-a26d9403d011","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4ddffda-efc0-45e7-b451-7e6fbb136757
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4ddffda-efc0-45e7-b451-7e6fbb136757"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14925355-7988-4b61-ab0d-411a761cb64a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14925355-7988-4b61-ab0d-411a761cb64a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14925355-7988-4b61-ab0d-411a761cb64a
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
correlation: qa-48ef5ec3-d7b6-46de-aaa3-40d0a9a72552

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ef5ec3-d7b6-46de-aaa3-40d0a9a72552
Content-Type: application/json

--- request body ---
{"handle":"qa-41b04f310409","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48ef5ec3-d7b6-46de-aaa3-40d0a9a72552
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48ef5ec3-d7b6-46de-aaa3-40d0a9a72552"}
```
