# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 369 | `qa-2cb43143-6386-465c-8628-855afa8e3ab3` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-2e87a761-344e-4bff-aeba-611fe9536129` |
| 3 | `POST /v1/accounts` | 201 | 81 | `qa-b4afe0a9-b5eb-4df1-a416-91c2c5d62b7e` |
| 4 | `POST /v1/auth/token` | 200 | 32 | `qa-5720779d-53bb-4455-a688-fe639695f33b` |
| 5 | `POST /v1/conversations` | 201 | 56 | `qa-3e27a72d-481b-44af-9ed9-a11034f57e88` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-3dfe7288-e8de-4483-b220-c3f1f62f76ad` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 20 | `qa-cd6ca74a-668b-4cf1-8518-d6153b0e966b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-1787824a-8888-4147-85cb-9506f0f38c65` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-18dd3fe8-1926-4e69-b34b-9283d729e3ad` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-d4763bd1-a1f0-4d5e-a6c5-c3b135c5ef3c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 71 | `qa-7dd0d272-ec75-4a88-84ee-876a565ad5cf` |
| 12 | `POST /v1/auth/token` | 401 | 21 | `qa-a54c5497-a1a6-49ac-9601-a2d9ec1ddee7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-c9b1f8c7-c102-4df5-a6ac-8d19ffdc516c` |
| 14 | `POST /v1/auth/token` | 401 | 23 | `qa-f27153c5-91af-468b-b082-8797e414a9b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2cb43143-6386-465c-8628-855afa8e3ab3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb43143-6386-465c-8628-855afa8e3ab3
Content-Type: application/json

--- request body ---
{"handle":"qa-8ad04ed0675b","displayName":"QA 8ad04ed0675b","password":"****","region":"eu"}

--- response: 201 in 369 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cb43143-6386-465c-8628-855afa8e3ab3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-8ad04ed0675b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce0490e3-ba93-46dd-ad8b-5e8269b60f00","handle":"qa-8ad04ed0675b","displayName":"QA 8ad04ed0675b","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.628850475Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2e87a761-344e-4bff-aeba-611fe9536129

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e87a761-344e-4bff-aeba-611fe9536129
Content-Type: application/json

--- request body ---
{"handle":"qa-dc7ba20ec31a","displayName":"QA dc7ba20ec31a","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e87a761-344e-4bff-aeba-611fe9536129
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-dc7ba20ec31a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9fa7b3da-1ca8-4f02-bdda-f51a1b14bc3b","handle":"qa-dc7ba20ec31a","displayName":"QA dc7ba20ec31a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.952301794Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b4afe0a9-b5eb-4df1-a416-91c2c5d62b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4afe0a9-b5eb-4df1-a416-91c2c5d62b7e
Content-Type: application/json

--- request body ---
{"handle":"qa-405fa1b208da","displayName":"QA 405fa1b208da","password":"****","region":"eu"}

--- response: 201 in 81 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4afe0a9-b5eb-4df1-a416-91c2c5d62b7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-405fa1b208da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7cb80ce6-9f33-4b9b-9d53-31aaa9877037","handle":"qa-405fa1b208da","displayName":"QA 405fa1b208da","region":"eu","role":"user","createdAt":"2026-11-02T09:38:35.038071983Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5720779d-53bb-4455-a688-fe639695f33b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5720779d-53bb-4455-a688-fe639695f33b
Content-Type: application/json

--- request body ---
{"handle":"qa-8ad04ed0675b","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5720779d-53bb-4455-a688-fe639695f33b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0490e3-ba93-46dd-ad8b-5e8269b60f00"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3e27a72d-481b-44af-9ed9-a11034f57e88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e27a72d-481b-44af-9ed9-a11034f57e88
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dc7ba20ec31a","subject":"Error contract","message":"Hi"}

--- response: 201 in 56 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e27a72d-481b-44af-9ed9-a11034f57e88
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
Location: /v1/conversations/cnv_5785f912-4b85-45aa-ac02-02b0c6bd5c7a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5785f912-4b85-45aa-ac02-02b0c6bd5c7a","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ad04ed0675b","qa-dc7ba20ec31a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.185813132Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3dfe7288-e8de-4483-b220-c3f1f62f76ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dfe7288-e8de-4483-b220-c3f1f62f76ad
Content-Type: application/json

--- request body ---
{"handle":"qa-405fa1b208da","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dfe7288-e8de-4483-b220-c3f1f62f76ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7cb80ce6-9f33-4b9b-9d53-31aaa9877037"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_5785f912-4b85-45aa-ac02-02b0c6bd5c7a/messages
correlation: qa-cd6ca74a-668b-4cf1-8518-d6153b0e966b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd6ca74a-668b-4cf1-8518-d6153b0e966b
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd6ca74a-668b-4cf1-8518-d6153b0e966b
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_5785f912-4b85-45aa-ac02-02b0c6bd5c7a/messages","correlationId":"qa-cd6ca74a-668b-4cf1-8518-d6153b0e966b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1787824a-8888-4147-85cb-9506f0f38c65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1787824a-8888-4147-85cb-9506f0f38c65
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1787824a-8888-4147-85cb-9506f0f38c65
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-18dd3fe8-1926-4e69-b34b-9283d729e3ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18dd3fe8-1926-4e69-b34b-9283d729e3ad
Content-Type: application/json

--- request body ---
{"handle":"qa-405fa1b208da","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18dd3fe8-1926-4e69-b34b-9283d729e3ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18dd3fe8-1926-4e69-b34b-9283d729e3ad"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d4763bd1-a1f0-4d5e-a6c5-c3b135c5ef3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4763bd1-a1f0-4d5e-a6c5-c3b135c5ef3c
Content-Type: application/json

--- request body ---
{"handle":"qa-dc7ba20ec31a","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4763bd1-a1f0-4d5e-a6c5-c3b135c5ef3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9fa7b3da-1ca8-4f02-bdda-f51a1b14bc3b"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7dd0d272-ec75-4a88-84ee-876a565ad5cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dd0d272-ec75-4a88-84ee-876a565ad5cf
Content-Type: application/json

--- response: 204 in 71 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7dd0d272-ec75-4a88-84ee-876a565ad5cf
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a54c5497-a1a6-49ac-9601-a2d9ec1ddee7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a54c5497-a1a6-49ac-9601-a2d9ec1ddee7
Content-Type: application/json

--- request body ---
{"handle":"qa-dc7ba20ec31a","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a54c5497-a1a6-49ac-9601-a2d9ec1ddee7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a54c5497-a1a6-49ac-9601-a2d9ec1ddee7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c9b1f8c7-c102-4df5-a6ac-8d19ffdc516c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9b1f8c7-c102-4df5-a6ac-8d19ffdc516c
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c9b1f8c7-c102-4df5-a6ac-8d19ffdc516c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f27153c5-91af-468b-b082-8797e414a9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f27153c5-91af-468b-b082-8797e414a9b4
Content-Type: application/json

--- request body ---
{"handle":"qa-8ad04ed0675b","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f27153c5-91af-468b-b082-8797e414a9b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f27153c5-91af-468b-b082-8797e414a9b4"}
```
