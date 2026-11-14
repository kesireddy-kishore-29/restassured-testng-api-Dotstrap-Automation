# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-2c304fc5-b53d-4521-b97b-5f2070a60d69` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-1366250a-d092-4379-a93f-522adb214ae7` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-17f77ab4-dc8a-41f7-9fc5-179ae33cfd4e` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-c2c89b8c-6f5f-4b99-b58d-100aeca0f327` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 5 | `qa-3044df47-8ad6-420f-93bb-e6685777b1be` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-7b7f8320-b6b5-4d39-8c9f-f93faaada9a6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9c14e0be-797b-4c81-b2ba-950c9138380b` |
| 8 | `POST /v1/auth/token` | 401 | 46 | `qa-fdaaf3a0-0ab6-467f-abe7-01722901fd4a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-90323fb6-fee2-48e3-af89-b0c36e610219` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-31338eac-3009-452f-93ab-f353d06ae116` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c304fc5-b53d-4521-b97b-5f2070a60d69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c304fc5-b53d-4521-b97b-5f2070a60d69
Content-Type: application/json

--- request body ---
{"handle":"qa-9e61c9b8ea4b","displayName":"QA 9e61c9b8ea4b","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c304fc5-b53d-4521-b97b-5f2070a60d69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-9e61c9b8ea4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3331cd0-c755-4385-a370-4f62344d7e95","handle":"qa-9e61c9b8ea4b","displayName":"QA 9e61c9b8ea4b","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.503487502Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1366250a-d092-4379-a93f-522adb214ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1366250a-d092-4379-a93f-522adb214ae7
Content-Type: application/json

--- request body ---
{"handle":"qa-23a74d5d1a25","displayName":"QA 23a74d5d1a25","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1366250a-d092-4379-a93f-522adb214ae7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-23a74d5d1a25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65bd2622-4d5c-48c7-8020-f59447c78463","handle":"qa-23a74d5d1a25","displayName":"QA 23a74d5d1a25","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.567381452Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17f77ab4-dc8a-41f7-9fc5-179ae33cfd4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17f77ab4-dc8a-41f7-9fc5-179ae33cfd4e
Content-Type: application/json

--- request body ---
{"handle":"qa-9e61c9b8ea4b","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-17f77ab4-dc8a-41f7-9fc5-179ae33cfd4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3331cd0-c755-4385-a370-4f62344d7e95"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c2c89b8c-6f5f-4b99-b58d-100aeca0f327

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2c89b8c-6f5f-4b99-b58d-100aeca0f327
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-23a74d5d1a25","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2c89b8c-6f5f-4b99-b58d-100aeca0f327
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
Location: /v1/conversations/cnv_0a10b7d0-27e1-430e-97cc-58403fd52729
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0a10b7d0-27e1-430e-97cc-58403fd52729","subject":"Error contract","status":"open","region":"eu","participants":["qa-9e61c9b8ea4b","qa-23a74d5d1a25"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.624832807Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0a10b7d0-27e1-430e-97cc-58403fd52729/messages
correlation: qa-3044df47-8ad6-420f-93bb-e6685777b1be

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3471edd3-1507-4d2f-a895-ac7c58a01fd4
X-Correlation-Id: qa-3044df47-8ad6-420f-93bb-e6685777b1be
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3044df47-8ad6-420f-93bb-e6685777b1be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_0a10b7d0-27e1-430e-97cc-58403fd52729/messages","correlationId":"qa-3044df47-8ad6-420f-93bb-e6685777b1be"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7b7f8320-b6b5-4d39-8c9f-f93faaada9a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7f8320-b6b5-4d39-8c9f-f93faaada9a6
Content-Type: application/json

--- request body ---
{"handle":"qa-23a74d5d1a25","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b7f8320-b6b5-4d39-8c9f-f93faaada9a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65bd2622-4d5c-48c7-8020-f59447c78463"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c14e0be-797b-4c81-b2ba-950c9138380b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c14e0be-797b-4c81-b2ba-950c9138380b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c14e0be-797b-4c81-b2ba-950c9138380b
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
correlation: qa-fdaaf3a0-0ab6-467f-abe7-01722901fd4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdaaf3a0-0ab6-467f-abe7-01722901fd4a
Content-Type: application/json

--- request body ---
{"handle":"qa-23a74d5d1a25","password":"****"}

--- response: 401 in 46 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fdaaf3a0-0ab6-467f-abe7-01722901fd4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fdaaf3a0-0ab6-467f-abe7-01722901fd4a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90323fb6-fee2-48e3-af89-b0c36e610219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90323fb6-fee2-48e3-af89-b0c36e610219
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90323fb6-fee2-48e3-af89-b0c36e610219
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
correlation: qa-31338eac-3009-452f-93ab-f353d06ae116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31338eac-3009-452f-93ab-f353d06ae116
Content-Type: application/json

--- request body ---
{"handle":"qa-9e61c9b8ea4b","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31338eac-3009-452f-93ab-f353d06ae116
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31338eac-3009-452f-93ab-f353d06ae116"}
```
