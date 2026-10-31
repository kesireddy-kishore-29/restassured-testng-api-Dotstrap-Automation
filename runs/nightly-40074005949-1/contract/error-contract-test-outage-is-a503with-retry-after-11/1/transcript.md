# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-e0ae867f-bb19-4ef2-9d1d-494941ec2260` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-6c75dd1c-d410-4ccf-8083-ce5e5c1e00a3` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-ae9016c1-d638-4366-97cb-65826288bfd2` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-60099ea7-fdcb-45ad-9d09-144530660d08` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 22 | `qa-cdd329fd-2e4d-466b-a46a-51a3feab53b8` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-62eefcfb-c15b-4177-8f8e-9467ffa2a1df` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5bcede54-485d-4382-af58-9e0c63f5da92` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-ef460bac-1b1f-43e6-8433-1d95b6cd9ffd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b5551a5e-500b-474c-9dd4-b572dfb57148` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-9f91f767-8d74-451b-8c09-3bb904e352d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e0ae867f-bb19-4ef2-9d1d-494941ec2260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0ae867f-bb19-4ef2-9d1d-494941ec2260
Content-Type: application/json

--- request body ---
{"handle":"qa-af76a12a81bf","displayName":"QA af76a12a81bf","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0ae867f-bb19-4ef2-9d1d-494941ec2260
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-af76a12a81bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf5bbbf1-5f3f-4285-bf70-d539f5b50836","handle":"qa-af76a12a81bf","displayName":"QA af76a12a81bf","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.310171302Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6c75dd1c-d410-4ccf-8083-ce5e5c1e00a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c75dd1c-d410-4ccf-8083-ce5e5c1e00a3
Content-Type: application/json

--- request body ---
{"handle":"qa-7f3b064e7fc1","displayName":"QA 7f3b064e7fc1","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c75dd1c-d410-4ccf-8083-ce5e5c1e00a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-7f3b064e7fc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5bfc9427-0ae0-41fc-b641-0ac5311a3ddc","handle":"qa-7f3b064e7fc1","displayName":"QA 7f3b064e7fc1","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.349540924Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ae9016c1-d638-4366-97cb-65826288bfd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9016c1-d638-4366-97cb-65826288bfd2
Content-Type: application/json

--- request body ---
{"handle":"qa-af76a12a81bf","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae9016c1-d638-4366-97cb-65826288bfd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf5bbbf1-5f3f-4285-bf70-d539f5b50836"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-60099ea7-fdcb-45ad-9d09-144530660d08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60099ea7-fdcb-45ad-9d09-144530660d08
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7f3b064e7fc1","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-60099ea7-fdcb-45ad-9d09-144530660d08
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
Location: /v1/conversations/cnv_c27c9247-fcb3-4089-8e74-79656d931599
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c27c9247-fcb3-4089-8e74-79656d931599","subject":"Error contract","status":"open","region":"eu","participants":["qa-af76a12a81bf","qa-7f3b064e7fc1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.425445929Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c27c9247-fcb3-4089-8e74-79656d931599/read
correlation: qa-cdd329fd-2e4d-466b-a46a-51a3feab53b8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 285a2419-9c1c-402f-9d6d-cde406ff0ae4
X-Correlation-Id: qa-cdd329fd-2e4d-466b-a46a-51a3feab53b8
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdd329fd-2e4d-466b-a46a-51a3feab53b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_c27c9247-fcb3-4089-8e74-79656d931599/read","correlationId":"qa-cdd329fd-2e4d-466b-a46a-51a3feab53b8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-62eefcfb-c15b-4177-8f8e-9467ffa2a1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62eefcfb-c15b-4177-8f8e-9467ffa2a1df
Content-Type: application/json

--- request body ---
{"handle":"qa-7f3b064e7fc1","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-62eefcfb-c15b-4177-8f8e-9467ffa2a1df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5bfc9427-0ae0-41fc-b641-0ac5311a3ddc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5bcede54-485d-4382-af58-9e0c63f5da92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bcede54-485d-4382-af58-9e0c63f5da92
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5bcede54-485d-4382-af58-9e0c63f5da92
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
correlation: qa-ef460bac-1b1f-43e6-8433-1d95b6cd9ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef460bac-1b1f-43e6-8433-1d95b6cd9ffd
Content-Type: application/json

--- request body ---
{"handle":"qa-7f3b064e7fc1","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef460bac-1b1f-43e6-8433-1d95b6cd9ffd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef460bac-1b1f-43e6-8433-1d95b6cd9ffd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5551a5e-500b-474c-9dd4-b572dfb57148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5551a5e-500b-474c-9dd4-b572dfb57148
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5551a5e-500b-474c-9dd4-b572dfb57148
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
correlation: qa-9f91f767-8d74-451b-8c09-3bb904e352d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f91f767-8d74-451b-8c09-3bb904e352d6
Content-Type: application/json

--- request body ---
{"handle":"qa-af76a12a81bf","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f91f767-8d74-451b-8c09-3bb904e352d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f91f767-8d74-451b-8c09-3bb904e352d6"}
```
