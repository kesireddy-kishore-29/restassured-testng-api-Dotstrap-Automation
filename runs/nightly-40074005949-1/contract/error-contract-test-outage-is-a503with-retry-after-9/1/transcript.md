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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-eee80756-b001-4c76-9f46-e351c82b8453` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-2478eb08-98b4-4170-9d35-2bb04ac75906` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-fb160c35-a203-48da-ad5f-57dace1261ad` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-bc446faa-abbb-43f5-8f0c-6b32b902c9d3` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 6 | `qa-036a45be-e7e3-4fac-82d1-0d4368106026` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-391bad97-8a5d-4f1f-a64f-9acc1378b801` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-34aea576-f854-4cd8-9d52-63e3d446212c` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-f2da8882-86d6-4b21-8cf0-bf23f38d6d3d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-0da4c1bb-18ce-462b-b82a-243d4c367630` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-44e6253b-aa66-4bbb-aced-2ae6859d1810` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eee80756-b001-4c76-9f46-e351c82b8453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eee80756-b001-4c76-9f46-e351c82b8453
Content-Type: application/json

--- request body ---
{"handle":"qa-5fbacb3c467b","displayName":"QA 5fbacb3c467b","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-eee80756-b001-4c76-9f46-e351c82b8453
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
Location: /v1/accounts/qa-5fbacb3c467b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18794679-8ce9-4b46-bc9b-e40658a2a13e","handle":"qa-5fbacb3c467b","displayName":"QA 5fbacb3c467b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.297460629Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2478eb08-98b4-4170-9d35-2bb04ac75906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2478eb08-98b4-4170-9d35-2bb04ac75906
Content-Type: application/json

--- request body ---
{"handle":"qa-2c9760cfafbf","displayName":"QA 2c9760cfafbf","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2478eb08-98b4-4170-9d35-2bb04ac75906
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
Location: /v1/accounts/qa-2c9760cfafbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a2b4028-a9ad-44a2-ae53-5902252cffad","handle":"qa-2c9760cfafbf","displayName":"QA 2c9760cfafbf","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.328315467Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fb160c35-a203-48da-ad5f-57dace1261ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb160c35-a203-48da-ad5f-57dace1261ad
Content-Type: application/json

--- request body ---
{"handle":"qa-5fbacb3c467b","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb160c35-a203-48da-ad5f-57dace1261ad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18794679-8ce9-4b46-bc9b-e40658a2a13e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bc446faa-abbb-43f5-8f0c-6b32b902c9d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc446faa-abbb-43f5-8f0c-6b32b902c9d3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2c9760cfafbf","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc446faa-abbb-43f5-8f0c-6b32b902c9d3
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
Location: /v1/conversations/cnv_53ce85f3-da20-4369-91ec-5f9c5704fe45
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53ce85f3-da20-4369-91ec-5f9c5704fe45","subject":"Error contract","status":"open","region":"eu","participants":["qa-5fbacb3c467b","qa-2c9760cfafbf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.393435589Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_53ce85f3-da20-4369-91ec-5f9c5704fe45/messages
correlation: qa-036a45be-e7e3-4fac-82d1-0d4368106026

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: aea3fbf5-8281-4ba4-8cf4-cfb258eab537
X-Correlation-Id: qa-036a45be-e7e3-4fac-82d1-0d4368106026
Content-Type: application/json

--- response: 503 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-036a45be-e7e3-4fac-82d1-0d4368106026
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_53ce85f3-da20-4369-91ec-5f9c5704fe45/messages","correlationId":"qa-036a45be-e7e3-4fac-82d1-0d4368106026"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-391bad97-8a5d-4f1f-a64f-9acc1378b801

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391bad97-8a5d-4f1f-a64f-9acc1378b801
Content-Type: application/json

--- request body ---
{"handle":"qa-2c9760cfafbf","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-391bad97-8a5d-4f1f-a64f-9acc1378b801
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a2b4028-a9ad-44a2-ae53-5902252cffad"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34aea576-f854-4cd8-9d52-63e3d446212c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34aea576-f854-4cd8-9d52-63e3d446212c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34aea576-f854-4cd8-9d52-63e3d446212c
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
correlation: qa-f2da8882-86d6-4b21-8cf0-bf23f38d6d3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2da8882-86d6-4b21-8cf0-bf23f38d6d3d
Content-Type: application/json

--- request body ---
{"handle":"qa-2c9760cfafbf","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2da8882-86d6-4b21-8cf0-bf23f38d6d3d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2da8882-86d6-4b21-8cf0-bf23f38d6d3d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0da4c1bb-18ce-462b-b82a-243d4c367630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0da4c1bb-18ce-462b-b82a-243d4c367630
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0da4c1bb-18ce-462b-b82a-243d4c367630
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
correlation: qa-44e6253b-aa66-4bbb-aced-2ae6859d1810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44e6253b-aa66-4bbb-aced-2ae6859d1810
Content-Type: application/json

--- request body ---
{"handle":"qa-5fbacb3c467b","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44e6253b-aa66-4bbb-aced-2ae6859d1810
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44e6253b-aa66-4bbb-aced-2ae6859d1810"}
```
