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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-fd690192-39c0-4a7c-95b4-4ce5169248cd` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-dcf32fd3-78cf-49eb-9e23-a4263e0f20a3` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-5f2d0508-82de-4545-b567-c4a8745779ef` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-77e01b18-7ce6-4434-97ae-026d8e93b506` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 18 | `qa-ced071e9-df4c-4992-944c-472d1b28f36f` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-28d95294-9a8c-44d4-9cc0-9d56a24047eb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-867e0400-ce27-4698-aa82-4b70d06049ad` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-1bbe69a9-fda5-4c03-a55d-5d49f6625e56` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-eed0dbed-9435-466e-ab7a-265e97272a3c` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-ab636d3d-8e72-4aa8-a45d-f7568e9d8d00` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd690192-39c0-4a7c-95b4-4ce5169248cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd690192-39c0-4a7c-95b4-4ce5169248cd
Content-Type: application/json

--- request body ---
{"handle":"qa-fddb8316fa94","displayName":"QA fddb8316fa94","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd690192-39c0-4a7c-95b4-4ce5169248cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Location: /v1/accounts/qa-fddb8316fa94
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8031c17e-db46-41b1-b11e-85facab237e4","handle":"qa-fddb8316fa94","displayName":"QA fddb8316fa94","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.424044236Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dcf32fd3-78cf-49eb-9e23-a4263e0f20a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf32fd3-78cf-49eb-9e23-a4263e0f20a3
Content-Type: application/json

--- request body ---
{"handle":"qa-eedf44c866f5","displayName":"QA eedf44c866f5","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcf32fd3-78cf-49eb-9e23-a4263e0f20a3
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
Location: /v1/accounts/qa-eedf44c866f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c7f568-26a2-44cc-b706-fd36dbd7fd7a","handle":"qa-eedf44c866f5","displayName":"QA eedf44c866f5","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.490523377Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5f2d0508-82de-4545-b567-c4a8745779ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f2d0508-82de-4545-b567-c4a8745779ef
Content-Type: application/json

--- request body ---
{"handle":"qa-fddb8316fa94","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f2d0508-82de-4545-b567-c4a8745779ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8031c17e-db46-41b1-b11e-85facab237e4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-77e01b18-7ce6-4434-97ae-026d8e93b506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e01b18-7ce6-4434-97ae-026d8e93b506
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eedf44c866f5","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-77e01b18-7ce6-4434-97ae-026d8e93b506
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
Location: /v1/conversations/cnv_1859b751-1e6a-4b85-8553-f7c1097e796c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1859b751-1e6a-4b85-8553-f7c1097e796c","subject":"Error contract","status":"open","region":"eu","participants":["qa-fddb8316fa94","qa-eedf44c866f5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.600792018Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_1859b751-1e6a-4b85-8553-f7c1097e796c/messages
correlation: qa-ced071e9-df4c-4992-944c-472d1b28f36f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6b3dad51-84f7-4159-8a8b-bd74e437175e
X-Correlation-Id: qa-ced071e9-df4c-4992-944c-472d1b28f36f
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ced071e9-df4c-4992-944c-472d1b28f36f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1859b751-1e6a-4b85-8553-f7c1097e796c/messages","correlationId":"qa-ced071e9-df4c-4992-944c-472d1b28f36f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-28d95294-9a8c-44d4-9cc0-9d56a24047eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28d95294-9a8c-44d4-9cc0-9d56a24047eb
Content-Type: application/json

--- request body ---
{"handle":"qa-eedf44c866f5","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-28d95294-9a8c-44d4-9cc0-9d56a24047eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50c7f568-26a2-44cc-b706-fd36dbd7fd7a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-867e0400-ce27-4698-aa82-4b70d06049ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-867e0400-ce27-4698-aa82-4b70d06049ad
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-867e0400-ce27-4698-aa82-4b70d06049ad
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
correlation: qa-1bbe69a9-fda5-4c03-a55d-5d49f6625e56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bbe69a9-fda5-4c03-a55d-5d49f6625e56
Content-Type: application/json

--- request body ---
{"handle":"qa-eedf44c866f5","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bbe69a9-fda5-4c03-a55d-5d49f6625e56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1bbe69a9-fda5-4c03-a55d-5d49f6625e56"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eed0dbed-9435-466e-ab7a-265e97272a3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed0dbed-9435-466e-ab7a-265e97272a3c
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eed0dbed-9435-466e-ab7a-265e97272a3c
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
correlation: qa-ab636d3d-8e72-4aa8-a45d-f7568e9d8d00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab636d3d-8e72-4aa8-a45d-f7568e9d8d00
Content-Type: application/json

--- request body ---
{"handle":"qa-fddb8316fa94","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab636d3d-8e72-4aa8-a45d-f7568e9d8d00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab636d3d-8e72-4aa8-a45d-f7568e9d8d00"}
```
