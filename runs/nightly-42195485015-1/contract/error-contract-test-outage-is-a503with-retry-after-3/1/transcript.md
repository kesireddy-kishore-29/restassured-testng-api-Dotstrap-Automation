# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-1d1a8953-f5fc-4241-a081-23a757912c8b` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-3c541a2e-38c9-4b7c-a80d-758e646365ec` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-bc7ffa99-fa34-43a7-a3a1-d4c159c2b578` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-45fe772c-6541-4bdc-9823-0e69c74532ff` |
| 5 | `PATCH /v1/accounts/me` | 503 | 15 | `qa-bf6cdb77-8fca-42ef-b468-be995009bd5d` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-d1416305-7cbc-42c7-b0fd-66709e765a96` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-acd674bd-bd01-4d43-94b0-eac89f9a34b8` |
| 8 | `POST /v1/auth/token` | 401 | 50 | `qa-3796cec9-07a6-4f81-b683-f9e358bd06d3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-4c4f26db-f91c-427d-a665-295829f235de` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-e42fa13f-0b36-48e5-9733-ecafaba68aa8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d1a8953-f5fc-4241-a081-23a757912c8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d1a8953-f5fc-4241-a081-23a757912c8b
Content-Type: application/json

--- request body ---
{"handle":"qa-fec90aa1b295","displayName":"QA fec90aa1b295","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d1a8953-f5fc-4241-a081-23a757912c8b
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
Location: /v1/accounts/qa-fec90aa1b295
X-Served-Region: eu
Content-Length: 181

{"id":"acc_860e215b-4d45-4962-b06d-cfffa0b2e96c","handle":"qa-fec90aa1b295","displayName":"QA fec90aa1b295","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.227216447Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c541a2e-38c9-4b7c-a80d-758e646365ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c541a2e-38c9-4b7c-a80d-758e646365ec
Content-Type: application/json

--- request body ---
{"handle":"qa-c356ff424437","displayName":"QA c356ff424437","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c541a2e-38c9-4b7c-a80d-758e646365ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Location: /v1/accounts/qa-c356ff424437
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76625b62-958c-48e1-b07a-c21eaec94a92","handle":"qa-c356ff424437","displayName":"QA c356ff424437","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.290833414Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bc7ffa99-fa34-43a7-a3a1-d4c159c2b578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc7ffa99-fa34-43a7-a3a1-d4c159c2b578
Content-Type: application/json

--- request body ---
{"handle":"qa-fec90aa1b295","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc7ffa99-fa34-43a7-a3a1-d4c159c2b578
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_860e215b-4d45-4962-b06d-cfffa0b2e96c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-45fe772c-6541-4bdc-9823-0e69c74532ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45fe772c-6541-4bdc-9823-0e69c74532ff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c356ff424437","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-45fe772c-6541-4bdc-9823-0e69c74532ff
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
Location: /v1/conversations/cnv_febf961d-c988-4906-b75d-9fdf895b8a02
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_febf961d-c988-4906-b75d-9fdf895b8a02","subject":"Error contract","status":"open","region":"eu","participants":["qa-fec90aa1b295","qa-c356ff424437"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.389918281Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-bf6cdb77-8fca-42ef-b468-be995009bd5d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bc6009d8-8894-4158-8347-9c149b8fd560
X-Correlation-Id: qa-bf6cdb77-8fca-42ef-b468-be995009bd5d
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf6cdb77-8fca-42ef-b468-be995009bd5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-bf6cdb77-8fca-42ef-b468-be995009bd5d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d1416305-7cbc-42c7-b0fd-66709e765a96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1416305-7cbc-42c7-b0fd-66709e765a96
Content-Type: application/json

--- request body ---
{"handle":"qa-c356ff424437","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1416305-7cbc-42c7-b0fd-66709e765a96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76625b62-958c-48e1-b07a-c21eaec94a92"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-acd674bd-bd01-4d43-94b0-eac89f9a34b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acd674bd-bd01-4d43-94b0-eac89f9a34b8
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-acd674bd-bd01-4d43-94b0-eac89f9a34b8
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
correlation: qa-3796cec9-07a6-4f81-b683-f9e358bd06d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3796cec9-07a6-4f81-b683-f9e358bd06d3
Content-Type: application/json

--- request body ---
{"handle":"qa-c356ff424437","password":"****"}

--- response: 401 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3796cec9-07a6-4f81-b683-f9e358bd06d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3796cec9-07a6-4f81-b683-f9e358bd06d3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c4f26db-f91c-427d-a665-295829f235de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c4f26db-f91c-427d-a665-295829f235de
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c4f26db-f91c-427d-a665-295829f235de
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e42fa13f-0b36-48e5-9733-ecafaba68aa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42fa13f-0b36-48e5-9733-ecafaba68aa8
Content-Type: application/json

--- request body ---
{"handle":"qa-fec90aa1b295","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e42fa13f-0b36-48e5-9733-ecafaba68aa8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e42fa13f-0b36-48e5-9733-ecafaba68aa8"}
```
