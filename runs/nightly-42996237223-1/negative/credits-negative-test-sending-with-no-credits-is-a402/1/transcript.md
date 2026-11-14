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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-95a66739-817b-4a7f-a4bd-f9997b49d30b` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-ba273243-cc56-40b1-b3e1-37417fec5a66` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-15b07b9b-a270-4489-abab-d3194730ab7f` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-d670ed53-f2df-43ca-815b-4936e4fb4f06` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-09f26e3a-de2d-4995-b504-92f0ae2c3872` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-7387ee2d-b9f9-4954-85c2-bc35f109c7b0` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-55ad1de6-7cc9-40f2-be99-319cc519851b` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-ecf72e21-5c5b-44ba-9b51-1be156b10aed` |
| 9 | `GET /v1/credits/balance` | 200 | 7 | `qa-84fdda2a-df4f-46e9-9895-dfc011476136` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 14 | `qa-bbf78230-0a38-4890-bc90-10ca990fac47` |
| 11 | `GET /v1/credits/ledger` | 200 | 11 | `qa-dee486c4-a7cd-426e-b0c0-4c2d37d4ac79` |
| 12 | `POST /v1/auth/token` | 200 | 9 | `qa-7daf4f39-2528-485a-9ca0-2c38385dda88` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ac7a6586-7089-47e9-9ddf-664211b91ce2` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-a2772d73-2513-4925-af4d-92d6dc5b7fdd` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-07e7b4bd-a2a6-4b4f-8a1c-7a787e5d30fa` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-d7d83823-a324-444b-9f97-bc101222a06a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-95a66739-817b-4a7f-a4bd-f9997b49d30b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95a66739-817b-4a7f-a4bd-f9997b49d30b
Content-Type: application/json

--- request body ---
{"handle":"qa-afb7ae79e901","displayName":"QA afb7ae79e901","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-95a66739-817b-4a7f-a4bd-f9997b49d30b
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
Location: /v1/accounts/qa-afb7ae79e901
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19fddf1b-55ba-43df-a1d8-9cbf42b4c82c","handle":"qa-afb7ae79e901","displayName":"QA afb7ae79e901","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.594127117Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba273243-cc56-40b1-b3e1-37417fec5a66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba273243-cc56-40b1-b3e1-37417fec5a66
Content-Type: application/json

--- request body ---
{"handle":"qa-9e4ddee34520","displayName":"QA 9e4ddee34520","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba273243-cc56-40b1-b3e1-37417fec5a66
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
Location: /v1/accounts/qa-9e4ddee34520
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f378865f-0fc8-4298-ae95-b79c757db33a","handle":"qa-9e4ddee34520","displayName":"QA 9e4ddee34520","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.640421739Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-15b07b9b-a270-4489-abab-d3194730ab7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15b07b9b-a270-4489-abab-d3194730ab7f
Content-Type: application/json

--- request body ---
{"handle":"qa-afb7ae79e901","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-15b07b9b-a270-4489-abab-d3194730ab7f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19fddf1b-55ba-43df-a1d8-9cbf42b4c82c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d670ed53-f2df-43ca-815b-4936e4fb4f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d670ed53-f2df-43ca-815b-4936e4fb4f06
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9e4ddee34520","subject":"Many messages","message":"1"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d670ed53-f2df-43ca-815b-4936e4fb4f06
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
Location: /v1/conversations/cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3","subject":"Many messages","status":"open","region":"eu","participants":["qa-afb7ae79e901","qa-9e4ddee34520"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:30.717338273Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3/messages
correlation: qa-09f26e3a-de2d-4995-b504-92f0ae2c3872

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f26e3a-de2d-4995-b504-92f0ae2c3872
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-09f26e3a-de2d-4995-b504-92f0ae2c3872
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

{"id":"msg_91ad6fdf-b128-4ea4-b3b8-2b4b85acf730","conversationId":"cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3","sender":"qa-afb7ae79e901","body":"2","createdAt":"2026-11-11T09:34:30.756110552Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3/messages
correlation: qa-7387ee2d-b9f9-4954-85c2-bc35f109c7b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7387ee2d-b9f9-4954-85c2-bc35f109c7b0
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7387ee2d-b9f9-4954-85c2-bc35f109c7b0
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

{"id":"msg_35c21b19-1d97-4bb7-ba2d-ba7c51fbdfe0","conversationId":"cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3","sender":"qa-afb7ae79e901","body":"3","createdAt":"2026-11-11T09:34:30.795169230Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3/messages
correlation: qa-55ad1de6-7cc9-40f2-be99-319cc519851b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ad1de6-7cc9-40f2-be99-319cc519851b
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-55ad1de6-7cc9-40f2-be99-319cc519851b
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

{"id":"msg_ff114ede-ac29-46e3-bcaa-3fc47ba77ffa","conversationId":"cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3","sender":"qa-afb7ae79e901","body":"4","createdAt":"2026-11-11T09:34:30.816595956Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3/messages
correlation: qa-ecf72e21-5c5b-44ba-9b51-1be156b10aed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecf72e21-5c5b-44ba-9b51-1be156b10aed
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecf72e21-5c5b-44ba-9b51-1be156b10aed
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

{"id":"msg_236bed83-a899-45be-a4f9-6ca9ab0e491c","conversationId":"cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3","sender":"qa-afb7ae79e901","body":"5","createdAt":"2026-11-11T09:34:30.846977864Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-84fdda2a-df4f-46e9-9895-dfc011476136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84fdda2a-df4f-46e9-9895-dfc011476136
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-84fdda2a-df4f-46e9-9895-dfc011476136
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

{"balance":0,"currency":"credits","accountId":"acc_19fddf1b-55ba-43df-a1d8-9cbf42b4c82c"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3/messages
correlation: qa-bbf78230-0a38-4890-bc90-10ca990fac47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbf78230-0a38-4890-bc90-10ca990fac47
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbf78230-0a38-4890-bc90-10ca990fac47
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3/messages","correlationId":"qa-bbf78230-0a38-4890-bc90-10ca990fac47"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-dee486c4-a7cd-426e-b0c0-4c2d37d4ac79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dee486c4-a7cd-426e-b0c0-4c2d37d4ac79
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-dee486c4-a7cd-426e-b0c0-4c2d37d4ac79
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

{"items":[{"id":"led_8fd3d9f3-e216-4abc-8c6f-9b112e63a13c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-11T09:34:30.594142420Z"},{"id":"led_7ca6d4dd-750e-4e39-8960-891cb88dbb09","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_70fa2b81-4a4d-4004-85d7-9ab8882548e3","createdAt":"2026-11-11T09:34:30.717323321Z"},{"id":"led_573ac56b-00a5-4d70-b134-1d1fece76892","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_91ad6fdf-b128-4ea4-b3b8-2b4b85acf730","createdAt":"2026-11-11T09:34:30.756085574Z"},{"id":"led_0bd454b8-b14d-48ef-a36e-d2515ce5e4e3","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_35c21b19-1d97-4bb7-ba2d-ba7c51fbdfe0","createdAt":"2026-11-11T09:34:30.795140638Z"},{"id":"led_637fbca1-95d1-4c03-9784-c3d5115973f4","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_ff114ede-ac29-46e3-bcaa-3fc47ba77ffa","createdAt":"2026-11-11T09:34:30.816568685Z"},{"id":"led_90d2b323-a11b-48de-84a3-fb47fe3bf7cf","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_236bed83-a899-45be-a4f9-6ca9ab0e491c","createdAt":"2026-11-11T09:34:30.846935841Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-7daf4f39-2528-485a-9ca0-2c38385dda88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7daf4f39-2528-485a-9ca0-2c38385dda88
Content-Type: application/json

--- request body ---
{"handle":"qa-9e4ddee34520","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7daf4f39-2528-485a-9ca0-2c38385dda88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f378865f-0fc8-4298-ae95-b79c757db33a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac7a6586-7089-47e9-9ddf-664211b91ce2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac7a6586-7089-47e9-9ddf-664211b91ce2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac7a6586-7089-47e9-9ddf-664211b91ce2
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
correlation: qa-a2772d73-2513-4925-af4d-92d6dc5b7fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2772d73-2513-4925-af4d-92d6dc5b7fdd
Content-Type: application/json

--- request body ---
{"handle":"qa-9e4ddee34520","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2772d73-2513-4925-af4d-92d6dc5b7fdd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a2772d73-2513-4925-af4d-92d6dc5b7fdd"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07e7b4bd-a2a6-4b4f-8a1c-7a787e5d30fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07e7b4bd-a2a6-4b4f-8a1c-7a787e5d30fa
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07e7b4bd-a2a6-4b4f-8a1c-7a787e5d30fa
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
correlation: qa-d7d83823-a324-444b-9f97-bc101222a06a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7d83823-a324-444b-9f97-bc101222a06a
Content-Type: application/json

--- request body ---
{"handle":"qa-afb7ae79e901","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7d83823-a324-444b-9f97-bc101222a06a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7d83823-a324-444b-9f97-bc101222a06a"}
```
