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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-dc8c17d8-47c3-4d66-b540-76dc69679b61` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-2f8f1183-2e19-4da8-bd56-0f3e0a4b0b28` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-b97caf18-dab4-444f-bc71-49cd0b343399` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-4513232a-a589-433f-807f-0af4c0a3b7a1` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-d66e32fc-b015-4779-9254-c86c76dda096` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-91744bac-595e-4a7f-be72-0b79c2125ee3` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-5a29f74c-2f4f-4991-8322-77b4babb0ba0` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-a62fa7ab-dcbf-4a78-9e0b-12ae26a829a1` |
| 9 | `GET /v1/credits/balance` | 200 | 6 | `qa-680cd679-f806-4062-8d71-dda4de83112b` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 6 | `qa-1a47fab6-479b-4d4b-8f17-6d511fb7a0d0` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-2adb87a7-f837-4ef6-92cd-249f215fccfc` |
| 12 | `POST /v1/auth/token` | 200 | 7 | `qa-dc19e3b1-7318-40b7-bd0e-718f9f480c10` |
| 13 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-584ba167-6a29-4287-baba-4930c405aa58` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-88a83822-9c22-49a1-82e3-fd2d3984d99c` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e6ee42a2-06ab-425d-83db-ce6c7ea848df` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-58ac3cdd-799a-4840-82d1-e35425f6e2d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dc8c17d8-47c3-4d66-b540-76dc69679b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc8c17d8-47c3-4d66-b540-76dc69679b61
Content-Type: application/json

--- request body ---
{"handle":"qa-98ce5ff472d1","displayName":"QA 98ce5ff472d1","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc8c17d8-47c3-4d66-b540-76dc69679b61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-98ce5ff472d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db828dfd-589a-4c1b-bd47-1c7363f379d2","handle":"qa-98ce5ff472d1","displayName":"QA 98ce5ff472d1","region":"eu","role":"user","createdAt":"2026-11-23T10:54:53.643686554Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f8f1183-2e19-4da8-bd56-0f3e0a4b0b28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f8f1183-2e19-4da8-bd56-0f3e0a4b0b28
Content-Type: application/json

--- request body ---
{"handle":"qa-94075564b596","displayName":"QA 94075564b596","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f8f1183-2e19-4da8-bd56-0f3e0a4b0b28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-94075564b596
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8740785-3938-4146-8a48-dec8b083ed08","handle":"qa-94075564b596","displayName":"QA 94075564b596","region":"eu","role":"user","createdAt":"2026-11-23T10:54:53.661964640Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b97caf18-dab4-444f-bc71-49cd0b343399

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b97caf18-dab4-444f-bc71-49cd0b343399
Content-Type: application/json

--- request body ---
{"handle":"qa-98ce5ff472d1","password":"****"}

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b97caf18-dab4-444f-bc71-49cd0b343399
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db828dfd-589a-4c1b-bd47-1c7363f379d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4513232a-a589-433f-807f-0af4c0a3b7a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4513232a-a589-433f-807f-0af4c0a3b7a1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94075564b596","subject":"Many messages","message":"1"}

--- response: 201 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4513232a-a589-433f-807f-0af4c0a3b7a1
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
Location: /v1/conversations/cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7","subject":"Many messages","status":"open","region":"eu","participants":["qa-98ce5ff472d1","qa-94075564b596"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:53.688417396Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7/messages
correlation: qa-d66e32fc-b015-4779-9254-c86c76dda096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d66e32fc-b015-4779-9254-c86c76dda096
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d66e32fc-b015-4779-9254-c86c76dda096
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

{"id":"msg_c55b7184-e2f4-4810-83a0-8f64fd43d7ba","conversationId":"cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7","sender":"qa-98ce5ff472d1","body":"2","createdAt":"2026-11-23T10:54:53.706643804Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7/messages
correlation: qa-91744bac-595e-4a7f-be72-0b79c2125ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91744bac-595e-4a7f-be72-0b79c2125ee3
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-91744bac-595e-4a7f-be72-0b79c2125ee3
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

{"id":"msg_faba8cc3-e313-40ea-b18a-d459837097f3","conversationId":"cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7","sender":"qa-98ce5ff472d1","body":"3","createdAt":"2026-11-23T10:54:53.739705722Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7/messages
correlation: qa-5a29f74c-2f4f-4991-8322-77b4babb0ba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a29f74c-2f4f-4991-8322-77b4babb0ba0
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 4 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a29f74c-2f4f-4991-8322-77b4babb0ba0
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

{"id":"msg_c41b3aa1-9653-4f9a-8b6c-45ffb04f28f7","conversationId":"cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7","sender":"qa-98ce5ff472d1","body":"4","createdAt":"2026-11-23T10:54:53.747931884Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7/messages
correlation: qa-a62fa7ab-dcbf-4a78-9e0b-12ae26a829a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a62fa7ab-dcbf-4a78-9e0b-12ae26a829a1
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a62fa7ab-dcbf-4a78-9e0b-12ae26a829a1
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

{"id":"msg_d303aa85-5bad-4513-8611-d3ebd5993b05","conversationId":"cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7","sender":"qa-98ce5ff472d1","body":"5","createdAt":"2026-11-23T10:54:53.759274660Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-680cd679-f806-4062-8d71-dda4de83112b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680cd679-f806-4062-8d71-dda4de83112b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-680cd679-f806-4062-8d71-dda4de83112b
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

{"balance":0,"currency":"credits","accountId":"acc_db828dfd-589a-4c1b-bd47-1c7363f379d2"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7/messages
correlation: qa-1a47fab6-479b-4d4b-8f17-6d511fb7a0d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a47fab6-479b-4d4b-8f17-6d511fb7a0d0
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a47fab6-479b-4d4b-8f17-6d511fb7a0d0
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7/messages","correlationId":"qa-1a47fab6-479b-4d4b-8f17-6d511fb7a0d0"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-2adb87a7-f837-4ef6-92cd-249f215fccfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2adb87a7-f837-4ef6-92cd-249f215fccfc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2adb87a7-f837-4ef6-92cd-249f215fccfc
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

{"items":[{"id":"led_8881b810-19e1-4b94-a3e0-48e399f4a3f2","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-23T10:54:53.643692333Z"},{"id":"led_59759b43-c014-4a7c-915a-a3b742b6881d","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_ce041c01-f2ca-40cd-ad85-561b5156d3f7","createdAt":"2026-11-23T10:54:53.688395573Z"},{"id":"led_96407219-4763-4a93-b4e6-34a46f82945e","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_c55b7184-e2f4-4810-83a0-8f64fd43d7ba","createdAt":"2026-11-23T10:54:53.706621611Z"},{"id":"led_3c9f4f9a-3cfc-44ec-a4e2-53dd4b5ac709","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_faba8cc3-e313-40ea-b18a-d459837097f3","createdAt":"2026-11-23T10:54:53.739685852Z"},{"id":"led_644618c6-c0e5-4070-92a3-f17e86d7f01e","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_c41b3aa1-9653-4f9a-8b6c-45ffb04f28f7","createdAt":"2026-11-23T10:54:53.747897091Z"},{"id":"led_aea1bc63-df78-4ed8-8bf7-90516524b58a","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_d303aa85-5bad-4513-8611-d3ebd5993b05","createdAt":"2026-11-23T10:54:53.759251555Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-dc19e3b1-7318-40b7-bd0e-718f9f480c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc19e3b1-7318-40b7-bd0e-718f9f480c10
Content-Type: application/json

--- request body ---
{"handle":"qa-94075564b596","password":"****"}

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc19e3b1-7318-40b7-bd0e-718f9f480c10
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8740785-3938-4146-8a48-dec8b083ed08"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-584ba167-6a29-4287-baba-4930c405aa58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-584ba167-6a29-4287-baba-4930c405aa58
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-584ba167-6a29-4287-baba-4930c405aa58
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
correlation: qa-88a83822-9c22-49a1-82e3-fd2d3984d99c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88a83822-9c22-49a1-82e3-fd2d3984d99c
Content-Type: application/json

--- request body ---
{"handle":"qa-94075564b596","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88a83822-9c22-49a1-82e3-fd2d3984d99c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88a83822-9c22-49a1-82e3-fd2d3984d99c"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6ee42a2-06ab-425d-83db-ce6c7ea848df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6ee42a2-06ab-425d-83db-ce6c7ea848df
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6ee42a2-06ab-425d-83db-ce6c7ea848df
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
correlation: qa-58ac3cdd-799a-4840-82d1-e35425f6e2d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ac3cdd-799a-4840-82d1-e35425f6e2d5
Content-Type: application/json

--- request body ---
{"handle":"qa-98ce5ff472d1","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58ac3cdd-799a-4840-82d1-e35425f6e2d5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58ac3cdd-799a-4840-82d1-e35425f6e2d5"}
```
