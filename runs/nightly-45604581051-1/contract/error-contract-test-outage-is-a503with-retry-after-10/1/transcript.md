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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-39100a87-a01d-4352-bb86-63ab069d5702` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-ff395eaf-ed17-47db-8a27-a33d1c43945c` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-003354ef-f1fb-4c40-a1a9-6728dbdba163` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-b5c2fb3d-1acd-4f97-bcc9-c84307bc7f25` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 16 | `qa-2ddc7e8f-7573-4aae-97ef-0181a73497ef` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-5c3df6c4-b4d6-44d2-ac46-479634acdc39` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-4a64a3f5-c971-4f79-b8fa-bbbd6f385d38` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-db32aec8-e464-4040-bbe0-52ebd7fcd83c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9d38dce4-508c-4d0b-8e0c-39a0eca33f33` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-bf0929ed-5ea7-4391-a3d7-1eff371f6b6b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-39100a87-a01d-4352-bb86-63ab069d5702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39100a87-a01d-4352-bb86-63ab069d5702
Content-Type: application/json

--- request body ---
{"handle":"qa-80e3940cf4f9","displayName":"QA 80e3940cf4f9","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-39100a87-a01d-4352-bb86-63ab069d5702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-80e3940cf4f9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_198dd2aa-e587-4e4f-b6a8-9493d8dd9c72","handle":"qa-80e3940cf4f9","displayName":"QA 80e3940cf4f9","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.952490754Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ff395eaf-ed17-47db-8a27-a33d1c43945c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff395eaf-ed17-47db-8a27-a33d1c43945c
Content-Type: application/json

--- request body ---
{"handle":"qa-4b7b1f5a7528","displayName":"QA 4b7b1f5a7528","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff395eaf-ed17-47db-8a27-a33d1c43945c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-4b7b1f5a7528
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6484fe6-e121-4b5d-b3bf-c5f60a2b43a6","handle":"qa-4b7b1f5a7528","displayName":"QA 4b7b1f5a7528","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.997111354Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-003354ef-f1fb-4c40-a1a9-6728dbdba163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003354ef-f1fb-4c40-a1a9-6728dbdba163
Content-Type: application/json

--- request body ---
{"handle":"qa-80e3940cf4f9","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-003354ef-f1fb-4c40-a1a9-6728dbdba163
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_198dd2aa-e587-4e4f-b6a8-9493d8dd9c72"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b5c2fb3d-1acd-4f97-bcc9-c84307bc7f25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5c2fb3d-1acd-4f97-bcc9-c84307bc7f25
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4b7b1f5a7528","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5c2fb3d-1acd-4f97-bcc9-c84307bc7f25
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
Location: /v1/conversations/cnv_1d682d0c-f426-4f15-bbea-43c063ae032e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1d682d0c-f426-4f15-bbea-43c063ae032e","subject":"Error contract","status":"open","region":"eu","participants":["qa-80e3940cf4f9","qa-4b7b1f5a7528"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.052896738Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1d682d0c-f426-4f15-bbea-43c063ae032e/messages
correlation: qa-2ddc7e8f-7573-4aae-97ef-0181a73497ef

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b921a3b4-b0d5-4b7d-aaa9-a018cb6c274c
X-Correlation-Id: qa-2ddc7e8f-7573-4aae-97ef-0181a73497ef
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ddc7e8f-7573-4aae-97ef-0181a73497ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1d682d0c-f426-4f15-bbea-43c063ae032e/messages","correlationId":"qa-2ddc7e8f-7573-4aae-97ef-0181a73497ef"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c3df6c4-b4d6-44d2-ac46-479634acdc39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c3df6c4-b4d6-44d2-ac46-479634acdc39
Content-Type: application/json

--- request body ---
{"handle":"qa-4b7b1f5a7528","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c3df6c4-b4d6-44d2-ac46-479634acdc39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6484fe6-e121-4b5d-b3bf-c5f60a2b43a6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a64a3f5-c971-4f79-b8fa-bbbd6f385d38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a64a3f5-c971-4f79-b8fa-bbbd6f385d38
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a64a3f5-c971-4f79-b8fa-bbbd6f385d38
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
correlation: qa-db32aec8-e464-4040-bbe0-52ebd7fcd83c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db32aec8-e464-4040-bbe0-52ebd7fcd83c
Content-Type: application/json

--- request body ---
{"handle":"qa-4b7b1f5a7528","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db32aec8-e464-4040-bbe0-52ebd7fcd83c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db32aec8-e464-4040-bbe0-52ebd7fcd83c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d38dce4-508c-4d0b-8e0c-39a0eca33f33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d38dce4-508c-4d0b-8e0c-39a0eca33f33
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d38dce4-508c-4d0b-8e0c-39a0eca33f33
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
correlation: qa-bf0929ed-5ea7-4391-a3d7-1eff371f6b6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0929ed-5ea7-4391-a3d7-1eff371f6b6b
Content-Type: application/json

--- request body ---
{"handle":"qa-80e3940cf4f9","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf0929ed-5ea7-4391-a3d7-1eff371f6b6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf0929ed-5ea7-4391-a3d7-1eff371f6b6b"}
```
