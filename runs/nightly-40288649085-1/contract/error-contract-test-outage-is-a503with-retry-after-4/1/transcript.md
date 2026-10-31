# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-4c1087e6-92fd-4064-8d70-9d6e90dcaf60` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-f4a62642-130f-49e0-8ba1-009fa69f4e2e` |
| 3 | `POST /v1/auth/token` | 200 | 70 | `qa-a8a3fe1b-8ea6-4338-99c8-ab8f99c16257` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-1d54dd2f-eb58-41af-a7fa-bc50b96b1be7` |
| 5 | `DELETE /v1/accounts/me` | 503 | 23 | `qa-b746beb1-4cc4-431c-86bc-9aceaf7ef9dd` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-6d2147e9-625c-4f82-ba99-ab8663358031` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4cc9c1eb-98e4-4a18-8cec-c746afdd7da6` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-3970ec32-da7f-4c74-8b4b-89777c828590` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2e78d606-9700-4af8-b096-7ec2d84822d1` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-ba333743-8841-43e2-884e-7a85a1162185` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c1087e6-92fd-4064-8d70-9d6e90dcaf60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1087e6-92fd-4064-8d70-9d6e90dcaf60
Content-Type: application/json

--- request body ---
{"handle":"qa-1d5a0ce035ff","displayName":"QA 1d5a0ce035ff","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c1087e6-92fd-4064-8d70-9d6e90dcaf60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-1d5a0ce035ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0521cd6f-4788-43eb-9628-86bde95c2d58","handle":"qa-1d5a0ce035ff","displayName":"QA 1d5a0ce035ff","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.487611534Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f4a62642-130f-49e0-8ba1-009fa69f4e2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4a62642-130f-49e0-8ba1-009fa69f4e2e
Content-Type: application/json

--- request body ---
{"handle":"qa-9c8c3cf1fb99","displayName":"QA 9c8c3cf1fb99","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4a62642-130f-49e0-8ba1-009fa69f4e2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-9c8c3cf1fb99
X-Served-Region: eu
Content-Length: 181

{"id":"acc_592f5f2e-2ca5-4f79-90e8-6040b22bf989","handle":"qa-9c8c3cf1fb99","displayName":"QA 9c8c3cf1fb99","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.540359016Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a8a3fe1b-8ea6-4338-99c8-ab8f99c16257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8a3fe1b-8ea6-4338-99c8-ab8f99c16257
Content-Type: application/json

--- request body ---
{"handle":"qa-1d5a0ce035ff","password":"****"}

--- response: 200 in 70 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8a3fe1b-8ea6-4338-99c8-ab8f99c16257
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0521cd6f-4788-43eb-9628-86bde95c2d58"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1d54dd2f-eb58-41af-a7fa-bc50b96b1be7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d54dd2f-eb58-41af-a7fa-bc50b96b1be7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c8c3cf1fb99","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d54dd2f-eb58-41af-a7fa-bc50b96b1be7
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
Location: /v1/conversations/cnv_7b5c7182-688e-4ce5-b69a-2d6e7fe6f571
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7b5c7182-688e-4ce5-b69a-2d6e7fe6f571","subject":"Error contract","status":"open","region":"eu","participants":["qa-1d5a0ce035ff","qa-9c8c3cf1fb99"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.671034822Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b746beb1-4cc4-431c-86bc-9aceaf7ef9dd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7c18fa94-f881-41e6-93b6-a2913d746eed
X-Correlation-Id: qa-b746beb1-4cc4-431c-86bc-9aceaf7ef9dd
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b746beb1-4cc4-431c-86bc-9aceaf7ef9dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b746beb1-4cc4-431c-86bc-9aceaf7ef9dd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6d2147e9-625c-4f82-ba99-ab8663358031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d2147e9-625c-4f82-ba99-ab8663358031
Content-Type: application/json

--- request body ---
{"handle":"qa-9c8c3cf1fb99","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d2147e9-625c-4f82-ba99-ab8663358031
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_592f5f2e-2ca5-4f79-90e8-6040b22bf989"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4cc9c1eb-98e4-4a18-8cec-c746afdd7da6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc9c1eb-98e4-4a18-8cec-c746afdd7da6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4cc9c1eb-98e4-4a18-8cec-c746afdd7da6
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
correlation: qa-3970ec32-da7f-4c74-8b4b-89777c828590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3970ec32-da7f-4c74-8b4b-89777c828590
Content-Type: application/json

--- request body ---
{"handle":"qa-9c8c3cf1fb99","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3970ec32-da7f-4c74-8b4b-89777c828590
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3970ec32-da7f-4c74-8b4b-89777c828590"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e78d606-9700-4af8-b096-7ec2d84822d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e78d606-9700-4af8-b096-7ec2d84822d1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e78d606-9700-4af8-b096-7ec2d84822d1
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
correlation: qa-ba333743-8841-43e2-884e-7a85a1162185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba333743-8841-43e2-884e-7a85a1162185
Content-Type: application/json

--- request body ---
{"handle":"qa-1d5a0ce035ff","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba333743-8841-43e2-884e-7a85a1162185
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba333743-8841-43e2-884e-7a85a1162185"}
```
