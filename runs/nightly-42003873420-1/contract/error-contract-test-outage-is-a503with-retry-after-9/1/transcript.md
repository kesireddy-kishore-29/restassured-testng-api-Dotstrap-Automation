# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-2d803ed6-35be-4efc-876c-180bac602a4a` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-7bc1b763-df4a-4582-baef-c41e97d50e4f` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-97f6ff0e-313d-49ce-89c9-1b9938d5c779` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-11962eb8-15fe-4b4f-9ba3-b5a0371cb603` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 20 | `qa-5a6d850a-2bd4-4c20-b4da-a22b441d8c4f` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-1b47170a-a68f-48f9-baf5-a36f6ddbfd36` |
| 7 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-1434421b-28c4-41d6-87de-afece6c960bd` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-b5405c70-864f-4713-b3a1-215f9e7d76ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4ac29bcf-d0b8-4ddd-b9c3-6d9c15eca823` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-d8d81b02-c100-41af-8ee0-4e844ba87d41` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d803ed6-35be-4efc-876c-180bac602a4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d803ed6-35be-4efc-876c-180bac602a4a
Content-Type: application/json

--- request body ---
{"handle":"qa-eda3d31699f5","displayName":"QA eda3d31699f5","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d803ed6-35be-4efc-876c-180bac602a4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Location: /v1/accounts/qa-eda3d31699f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54184a03-9232-4f19-bdbb-bac006b595a1","handle":"qa-eda3d31699f5","displayName":"QA eda3d31699f5","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.041117724Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7bc1b763-df4a-4582-baef-c41e97d50e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bc1b763-df4a-4582-baef-c41e97d50e4f
Content-Type: application/json

--- request body ---
{"handle":"qa-fa8f7eae8f79","displayName":"QA fa8f7eae8f79","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bc1b763-df4a-4582-baef-c41e97d50e4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Location: /v1/accounts/qa-fa8f7eae8f79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a16bcdbb-ffae-42c7-ac6f-c733a5a4ece6","handle":"qa-fa8f7eae8f79","displayName":"QA fa8f7eae8f79","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.106627643Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97f6ff0e-313d-49ce-89c9-1b9938d5c779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97f6ff0e-313d-49ce-89c9-1b9938d5c779
Content-Type: application/json

--- request body ---
{"handle":"qa-eda3d31699f5","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-97f6ff0e-313d-49ce-89c9-1b9938d5c779
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54184a03-9232-4f19-bdbb-bac006b595a1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-11962eb8-15fe-4b4f-9ba3-b5a0371cb603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11962eb8-15fe-4b4f-9ba3-b5a0371cb603
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fa8f7eae8f79","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-11962eb8-15fe-4b4f-9ba3-b5a0371cb603
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
Location: /v1/conversations/cnv_37b5c015-6e02-4271-8818-9dd5ba54ccf3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_37b5c015-6e02-4271-8818-9dd5ba54ccf3","subject":"Error contract","status":"open","region":"eu","participants":["qa-eda3d31699f5","qa-fa8f7eae8f79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.194627160Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_37b5c015-6e02-4271-8818-9dd5ba54ccf3/messages
correlation: qa-5a6d850a-2bd4-4c20-b4da-a22b441d8c4f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f26fdfdb-3174-4e7d-99b6-b5d989c9efda
X-Correlation-Id: qa-5a6d850a-2bd4-4c20-b4da-a22b441d8c4f
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a6d850a-2bd4-4c20-b4da-a22b441d8c4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_37b5c015-6e02-4271-8818-9dd5ba54ccf3/messages","correlationId":"qa-5a6d850a-2bd4-4c20-b4da-a22b441d8c4f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1b47170a-a68f-48f9-baf5-a36f6ddbfd36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b47170a-a68f-48f9-baf5-a36f6ddbfd36
Content-Type: application/json

--- request body ---
{"handle":"qa-fa8f7eae8f79","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b47170a-a68f-48f9-baf5-a36f6ddbfd36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a16bcdbb-ffae-42c7-ac6f-c733a5a4ece6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1434421b-28c4-41d6-87de-afece6c960bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1434421b-28c4-41d6-87de-afece6c960bd
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1434421b-28c4-41d6-87de-afece6c960bd
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
correlation: qa-b5405c70-864f-4713-b3a1-215f9e7d76ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5405c70-864f-4713-b3a1-215f9e7d76ee
Content-Type: application/json

--- request body ---
{"handle":"qa-fa8f7eae8f79","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5405c70-864f-4713-b3a1-215f9e7d76ee
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5405c70-864f-4713-b3a1-215f9e7d76ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ac29bcf-d0b8-4ddd-b9c3-6d9c15eca823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ac29bcf-d0b8-4ddd-b9c3-6d9c15eca823
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ac29bcf-d0b8-4ddd-b9c3-6d9c15eca823
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
correlation: qa-d8d81b02-c100-41af-8ee0-4e844ba87d41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d81b02-c100-41af-8ee0-4e844ba87d41
Content-Type: application/json

--- request body ---
{"handle":"qa-eda3d31699f5","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8d81b02-c100-41af-8ee0-4e844ba87d41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8d81b02-c100-41af-8ee0-4e844ba87d41"}
```
