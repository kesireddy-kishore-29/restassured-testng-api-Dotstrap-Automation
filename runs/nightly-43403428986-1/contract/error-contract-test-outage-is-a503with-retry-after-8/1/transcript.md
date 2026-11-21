# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-e2a5f133-c85f-4c5e-9044-eb44ca1a0e1c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-ecb3024c-2f79-4d91-900c-cd2c5d523e5c` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-db973ca8-989d-4dca-9e4c-32925875d3a5` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-8e4a8807-be26-4e9d-997d-32b34da66fa6` |
| 5 | `GET /v1/conversations/{id}` | 503 | 30 | `qa-6c667fb2-52dc-49fc-981c-261c6df1df5b` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-91d2e49b-0572-4257-9a57-4383a65cad6d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-de9693a3-eb20-49ee-a07e-9ce2e4e606a1` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-489a8207-99e8-417e-ab25-9630e0ab5c77` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-6108ced1-9ace-49a5-ba94-2d8e61e95315` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-670acaa6-1c65-47fd-b126-7150409511b5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2a5f133-c85f-4c5e-9044-eb44ca1a0e1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a5f133-c85f-4c5e-9044-eb44ca1a0e1c
Content-Type: application/json

--- request body ---
{"handle":"qa-42b4a391900f","displayName":"QA 42b4a391900f","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2a5f133-c85f-4c5e-9044-eb44ca1a0e1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Location: /v1/accounts/qa-42b4a391900f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11e86e4c-1cde-4105-b242-e075b34a49b7","handle":"qa-42b4a391900f","displayName":"QA 42b4a391900f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.514713171Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ecb3024c-2f79-4d91-900c-cd2c5d523e5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb3024c-2f79-4d91-900c-cd2c5d523e5c
Content-Type: application/json

--- request body ---
{"handle":"qa-32442ee2f5bb","displayName":"QA 32442ee2f5bb","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecb3024c-2f79-4d91-900c-cd2c5d523e5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-32442ee2f5bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b52dd268-d02f-42f3-bc3c-daff8fc46d0b","handle":"qa-32442ee2f5bb","displayName":"QA 32442ee2f5bb","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.557346252Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-db973ca8-989d-4dca-9e4c-32925875d3a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db973ca8-989d-4dca-9e4c-32925875d3a5
Content-Type: application/json

--- request body ---
{"handle":"qa-42b4a391900f","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-db973ca8-989d-4dca-9e4c-32925875d3a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11e86e4c-1cde-4105-b242-e075b34a49b7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8e4a8807-be26-4e9d-997d-32b34da66fa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e4a8807-be26-4e9d-997d-32b34da66fa6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-32442ee2f5bb","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e4a8807-be26-4e9d-997d-32b34da66fa6
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
Location: /v1/conversations/cnv_ad1c8c59-bfff-4a2f-9127-17c657cdc923
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ad1c8c59-bfff-4a2f-9127-17c657cdc923","subject":"Error contract","status":"open","region":"eu","participants":["qa-42b4a391900f","qa-32442ee2f5bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.614050661Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_ad1c8c59-bfff-4a2f-9127-17c657cdc923
correlation: qa-6c667fb2-52dc-49fc-981c-261c6df1df5b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e3b48aea-957c-4b4e-949f-731487010895
X-Correlation-Id: qa-6c667fb2-52dc-49fc-981c-261c6df1df5b
Content-Type: application/json

--- response: 503 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c667fb2-52dc-49fc-981c-261c6df1df5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ad1c8c59-bfff-4a2f-9127-17c657cdc923","correlationId":"qa-6c667fb2-52dc-49fc-981c-261c6df1df5b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-91d2e49b-0572-4257-9a57-4383a65cad6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91d2e49b-0572-4257-9a57-4383a65cad6d
Content-Type: application/json

--- request body ---
{"handle":"qa-32442ee2f5bb","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-91d2e49b-0572-4257-9a57-4383a65cad6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b52dd268-d02f-42f3-bc3c-daff8fc46d0b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de9693a3-eb20-49ee-a07e-9ce2e4e606a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de9693a3-eb20-49ee-a07e-9ce2e4e606a1
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de9693a3-eb20-49ee-a07e-9ce2e4e606a1
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
correlation: qa-489a8207-99e8-417e-ab25-9630e0ab5c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-489a8207-99e8-417e-ab25-9630e0ab5c77
Content-Type: application/json

--- request body ---
{"handle":"qa-32442ee2f5bb","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-489a8207-99e8-417e-ab25-9630e0ab5c77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-489a8207-99e8-417e-ab25-9630e0ab5c77"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6108ced1-9ace-49a5-ba94-2d8e61e95315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6108ced1-9ace-49a5-ba94-2d8e61e95315
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6108ced1-9ace-49a5-ba94-2d8e61e95315
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
correlation: qa-670acaa6-1c65-47fd-b126-7150409511b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-670acaa6-1c65-47fd-b126-7150409511b5
Content-Type: application/json

--- request body ---
{"handle":"qa-42b4a391900f","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-670acaa6-1c65-47fd-b126-7150409511b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-670acaa6-1c65-47fd-b126-7150409511b5"}
```
