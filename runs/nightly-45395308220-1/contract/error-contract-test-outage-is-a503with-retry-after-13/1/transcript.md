# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-87203179-2b57-4a5d-ae3f-deb72bac0c17` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-e8039feb-d5ac-443a-901d-01e29507f222` |
| 3 | `POST /v1/auth/token` | 200 | 64 | `qa-f7d261f3-4f21-478b-b90c-4fed836ce72a` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-a9eb7708-1ce5-4533-b1bc-74f89e788130` |
| 5 | `GET /v1/credits/balance` | 503 | 8 | `qa-c387aead-1881-4b0a-8259-88fe89713bc7` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-d4a4c82b-e6bb-41a6-8bc1-b780bf6b3f19` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-ec157f37-2b81-455b-9a59-62977c996d82` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-9fd8596d-0be6-458e-b7ce-cc46d4723658` |
| 9 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-fea7526f-3642-4fc7-91bf-8369c77ee6fc` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-cba5b79f-7f55-4a71-9b13-7d9ece8b5a32` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-87203179-2b57-4a5d-ae3f-deb72bac0c17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87203179-2b57-4a5d-ae3f-deb72bac0c17
Content-Type: application/json

--- request body ---
{"handle":"qa-25030c70bae2","displayName":"QA 25030c70bae2","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-87203179-2b57-4a5d-ae3f-deb72bac0c17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Location: /v1/accounts/qa-25030c70bae2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81e2b431-d392-43e2-9fbb-05ecfca504c8","handle":"qa-25030c70bae2","displayName":"QA 25030c70bae2","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.457645116Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e8039feb-d5ac-443a-901d-01e29507f222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8039feb-d5ac-443a-901d-01e29507f222
Content-Type: application/json

--- request body ---
{"handle":"qa-347b7a3bbc07","displayName":"QA 347b7a3bbc07","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8039feb-d5ac-443a-901d-01e29507f222
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Location: /v1/accounts/qa-347b7a3bbc07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7f51ca0-d9a8-4283-91a1-ede93f144a0c","handle":"qa-347b7a3bbc07","displayName":"QA 347b7a3bbc07","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.496242417Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f7d261f3-4f21-478b-b90c-4fed836ce72a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7d261f3-4f21-478b-b90c-4fed836ce72a
Content-Type: application/json

--- request body ---
{"handle":"qa-25030c70bae2","password":"****"}

--- response: 200 in 64 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7d261f3-4f21-478b-b90c-4fed836ce72a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81e2b431-d392-43e2-9fbb-05ecfca504c8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a9eb7708-1ce5-4533-b1bc-74f89e788130

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9eb7708-1ce5-4533-b1bc-74f89e788130
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-347b7a3bbc07","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9eb7708-1ce5-4533-b1bc-74f89e788130
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
Location: /v1/conversations/cnv_2ccd9f27-e39e-4490-9ec3-d832a8b38655
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2ccd9f27-e39e-4490-9ec3-d832a8b38655","subject":"Error contract","status":"open","region":"eu","participants":["qa-25030c70bae2","qa-347b7a3bbc07"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.602719543Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c387aead-1881-4b0a-8259-88fe89713bc7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5e6583c5-4244-41ad-be3c-3cc19630f82f
X-Correlation-Id: qa-c387aead-1881-4b0a-8259-88fe89713bc7
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c387aead-1881-4b0a-8259-88fe89713bc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-c387aead-1881-4b0a-8259-88fe89713bc7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d4a4c82b-e6bb-41a6-8bc1-b780bf6b3f19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4a4c82b-e6bb-41a6-8bc1-b780bf6b3f19
Content-Type: application/json

--- request body ---
{"handle":"qa-347b7a3bbc07","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4a4c82b-e6bb-41a6-8bc1-b780bf6b3f19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7f51ca0-d9a8-4283-91a1-ede93f144a0c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec157f37-2b81-455b-9a59-62977c996d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec157f37-2b81-455b-9a59-62977c996d82
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec157f37-2b81-455b-9a59-62977c996d82
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
correlation: qa-9fd8596d-0be6-458e-b7ce-cc46d4723658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fd8596d-0be6-458e-b7ce-cc46d4723658
Content-Type: application/json

--- request body ---
{"handle":"qa-347b7a3bbc07","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fd8596d-0be6-458e-b7ce-cc46d4723658
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fd8596d-0be6-458e-b7ce-cc46d4723658"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fea7526f-3642-4fc7-91bf-8369c77ee6fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fea7526f-3642-4fc7-91bf-8369c77ee6fc
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fea7526f-3642-4fc7-91bf-8369c77ee6fc
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
correlation: qa-cba5b79f-7f55-4a71-9b13-7d9ece8b5a32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cba5b79f-7f55-4a71-9b13-7d9ece8b5a32
Content-Type: application/json

--- request body ---
{"handle":"qa-25030c70bae2","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cba5b79f-7f55-4a71-9b13-7d9ece8b5a32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cba5b79f-7f55-4a71-9b13-7d9ece8b5a32"}
```
