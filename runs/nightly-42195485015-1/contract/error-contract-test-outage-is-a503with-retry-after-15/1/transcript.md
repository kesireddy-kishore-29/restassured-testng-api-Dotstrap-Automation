# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-cede0556-b413-4dea-8fc9-41442133afa9` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-da948985-632f-4551-92c9-3d9409319da1` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-7195fc5b-8f47-4443-8982-8d7220376381` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-e754a490-d2c2-4010-8bc0-d39d5f48dcbd` |
| 5 | `POST /v1/credits/purchases` | 503 | 8 | `qa-dd43fbeb-5d94-4524-8d70-d90cac40ce4f` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-678b4cd3-62ff-4bf7-b969-0e5267b6a288` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-19284a89-718b-4e6e-9463-b90c8c4c3522` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-8c9a2f02-2deb-47f1-88a4-a9630f87039f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-73276dd4-aae9-4472-8b66-6ffdf47233f6` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-ad57f349-55bc-47d3-a3d1-b3fe49333eda` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cede0556-b413-4dea-8fc9-41442133afa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cede0556-b413-4dea-8fc9-41442133afa9
Content-Type: application/json

--- request body ---
{"handle":"qa-66045ef84ed3","displayName":"QA 66045ef84ed3","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cede0556-b413-4dea-8fc9-41442133afa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Location: /v1/accounts/qa-66045ef84ed3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_277f1bf9-2317-4206-9149-ce561f1c6476","handle":"qa-66045ef84ed3","displayName":"QA 66045ef84ed3","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.176126431Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-da948985-632f-4551-92c9-3d9409319da1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da948985-632f-4551-92c9-3d9409319da1
Content-Type: application/json

--- request body ---
{"handle":"qa-4fe9033dce13","displayName":"QA 4fe9033dce13","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-da948985-632f-4551-92c9-3d9409319da1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-4fe9033dce13
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a79bd107-dee6-4070-bd1b-670b3e671049","handle":"qa-4fe9033dce13","displayName":"QA 4fe9033dce13","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.268912212Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7195fc5b-8f47-4443-8982-8d7220376381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7195fc5b-8f47-4443-8982-8d7220376381
Content-Type: application/json

--- request body ---
{"handle":"qa-66045ef84ed3","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7195fc5b-8f47-4443-8982-8d7220376381
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_277f1bf9-2317-4206-9149-ce561f1c6476"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e754a490-d2c2-4010-8bc0-d39d5f48dcbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e754a490-d2c2-4010-8bc0-d39d5f48dcbd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4fe9033dce13","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e754a490-d2c2-4010-8bc0-d39d5f48dcbd
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
Location: /v1/conversations/cnv_e04aaa3e-e414-4cb5-beec-12c477a96d07
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e04aaa3e-e414-4cb5-beec-12c477a96d07","subject":"Error contract","status":"open","region":"eu","participants":["qa-66045ef84ed3","qa-4fe9033dce13"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.372600025Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dd43fbeb-5d94-4524-8d70-d90cac40ce4f

--- request headers ---
Accept: application/json
X-Fault-Key: d2905b83-68f6-476b-b84f-b58d11258be1
Idempotency-Key: qa-ead20fb0e5e34409abbb5286ac3fb4bb
X-Fault: unavailable-once
X-Correlation-Id: qa-dd43fbeb-5d94-4524-8d70-d90cac40ce4f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd43fbeb-5d94-4524-8d70-d90cac40ce4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-dd43fbeb-5d94-4524-8d70-d90cac40ce4f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-678b4cd3-62ff-4bf7-b969-0e5267b6a288

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-678b4cd3-62ff-4bf7-b969-0e5267b6a288
Content-Type: application/json

--- request body ---
{"handle":"qa-4fe9033dce13","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-678b4cd3-62ff-4bf7-b969-0e5267b6a288
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a79bd107-dee6-4070-bd1b-670b3e671049"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19284a89-718b-4e6e-9463-b90c8c4c3522

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19284a89-718b-4e6e-9463-b90c8c4c3522
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19284a89-718b-4e6e-9463-b90c8c4c3522
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-8c9a2f02-2deb-47f1-88a4-a9630f87039f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9a2f02-2deb-47f1-88a4-a9630f87039f
Content-Type: application/json

--- request body ---
{"handle":"qa-4fe9033dce13","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c9a2f02-2deb-47f1-88a4-a9630f87039f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c9a2f02-2deb-47f1-88a4-a9630f87039f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73276dd4-aae9-4472-8b66-6ffdf47233f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73276dd4-aae9-4472-8b66-6ffdf47233f6
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73276dd4-aae9-4472-8b66-6ffdf47233f6
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ad57f349-55bc-47d3-a3d1-b3fe49333eda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad57f349-55bc-47d3-a3d1-b3fe49333eda
Content-Type: application/json

--- request body ---
{"handle":"qa-66045ef84ed3","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad57f349-55bc-47d3-a3d1-b3fe49333eda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad57f349-55bc-47d3-a3d1-b3fe49333eda"}
```
