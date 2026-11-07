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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-cc80eb2e-681d-4752-b107-6d5196e7c308` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-19d546db-e66c-47be-b239-75fb58ed9a44` |
| 3 | `POST /v1/auth/token` | 200 | 74 | `qa-29320e82-85d5-4308-99d5-8e80acca6a7b` |
| 4 | `POST /v1/conversations` | 201 | 34 | `qa-2dfc2663-e462-4d29-b5d3-4fb7b10951a1` |
| 5 | `DELETE /v1/accounts/me` | 503 | 52 | `qa-6f999e94-d680-46f9-8d8b-5517589de74c` |
| 6 | `POST /v1/auth/token` | 200 | 59 | `qa-a977ead0-caa8-49d8-9d26-13ddc3004cde` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ed0fcdfd-58f8-42b0-80e0-53421ab96cd1` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-73f80d0f-cf0f-4bec-b7b4-bf5541e622cc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-59589ac1-ac81-4714-b367-21454d7c1a54` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-99f7472f-ccd1-405c-8bc6-dd3b24eab659` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc80eb2e-681d-4752-b107-6d5196e7c308

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc80eb2e-681d-4752-b107-6d5196e7c308
Content-Type: application/json

--- request body ---
{"handle":"qa-a8c092ee897c","displayName":"QA a8c092ee897c","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc80eb2e-681d-4752-b107-6d5196e7c308
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Location: /v1/accounts/qa-a8c092ee897c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75c6db31-7686-421f-b0c1-e60fb39cda64","handle":"qa-a8c092ee897c","displayName":"QA a8c092ee897c","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.759481234Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-19d546db-e66c-47be-b239-75fb58ed9a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19d546db-e66c-47be-b239-75fb58ed9a44
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca5f4fe7aa6","displayName":"QA 6ca5f4fe7aa6","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-19d546db-e66c-47be-b239-75fb58ed9a44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Location: /v1/accounts/qa-6ca5f4fe7aa6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e10b6583-46c1-4a37-b64a-9e58cb20d21a","handle":"qa-6ca5f4fe7aa6","displayName":"QA 6ca5f4fe7aa6","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.836903565Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-29320e82-85d5-4308-99d5-8e80acca6a7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29320e82-85d5-4308-99d5-8e80acca6a7b
Content-Type: application/json

--- request body ---
{"handle":"qa-a8c092ee897c","password":"****"}

--- response: 200 in 74 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-29320e82-85d5-4308-99d5-8e80acca6a7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75c6db31-7686-421f-b0c1-e60fb39cda64"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2dfc2663-e462-4d29-b5d3-4fb7b10951a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dfc2663-e462-4d29-b5d3-4fb7b10951a1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6ca5f4fe7aa6","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dfc2663-e462-4d29-b5d3-4fb7b10951a1
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
Location: /v1/conversations/cnv_d42a1722-bd19-4d4e-9c1b-3e511dd61e46
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d42a1722-bd19-4d4e-9c1b-3e511dd61e46","subject":"Error contract","status":"open","region":"eu","participants":["qa-a8c092ee897c","qa-6ca5f4fe7aa6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.999815643Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f999e94-d680-46f9-8d8b-5517589de74c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c56ab4ee-5213-4b80-a44a-66962304c3a2
X-Correlation-Id: qa-6f999e94-d680-46f9-8d8b-5517589de74c
Content-Type: application/json

--- response: 503 in 52 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f999e94-d680-46f9-8d8b-5517589de74c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-6f999e94-d680-46f9-8d8b-5517589de74c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a977ead0-caa8-49d8-9d26-13ddc3004cde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a977ead0-caa8-49d8-9d26-13ddc3004cde
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca5f4fe7aa6","password":"****"}

--- response: 200 in 59 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a977ead0-caa8-49d8-9d26-13ddc3004cde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e10b6583-46c1-4a37-b64a-9e58cb20d21a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed0fcdfd-58f8-42b0-80e0-53421ab96cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed0fcdfd-58f8-42b0-80e0-53421ab96cd1
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed0fcdfd-58f8-42b0-80e0-53421ab96cd1
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
correlation: qa-73f80d0f-cf0f-4bec-b7b4-bf5541e622cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73f80d0f-cf0f-4bec-b7b4-bf5541e622cc
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca5f4fe7aa6","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73f80d0f-cf0f-4bec-b7b4-bf5541e622cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73f80d0f-cf0f-4bec-b7b4-bf5541e622cc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59589ac1-ac81-4714-b367-21454d7c1a54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59589ac1-ac81-4714-b367-21454d7c1a54
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59589ac1-ac81-4714-b367-21454d7c1a54
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
correlation: qa-99f7472f-ccd1-405c-8bc6-dd3b24eab659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99f7472f-ccd1-405c-8bc6-dd3b24eab659
Content-Type: application/json

--- request body ---
{"handle":"qa-a8c092ee897c","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99f7472f-ccd1-405c-8bc6-dd3b24eab659
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99f7472f-ccd1-405c-8bc6-dd3b24eab659"}
```
