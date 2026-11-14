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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-01930c18-7caa-4902-b735-f665c2b8c54a` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-10c1ae1b-7018-4204-9db2-8a81b0d1d58c` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-36a49e3d-c846-4545-b3cf-98fcd2623712` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-d3cd7729-4533-4c74-b39c-ce58d20ad79b` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 27 | `qa-e96f395b-4038-4fc5-a9fb-47c189a1a72c` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-6059d69e-0085-4103-aff2-f8cfdd8dd702` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-457aa24a-f8bb-41d9-aac9-3dc66553ebd2` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-af2e2bbe-3e5c-4722-8877-e667ac4d5a55` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-21c4c0b7-4389-49dc-9427-3448fdc7ec2a` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-1d737e5c-dd1e-41ac-afc6-4a64c5947dc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01930c18-7caa-4902-b735-f665c2b8c54a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01930c18-7caa-4902-b735-f665c2b8c54a
Content-Type: application/json

--- request body ---
{"handle":"qa-44c155b29886","displayName":"QA 44c155b29886","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-01930c18-7caa-4902-b735-f665c2b8c54a
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
Location: /v1/accounts/qa-44c155b29886
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de12eb94-d494-4a77-8926-269692b49db9","handle":"qa-44c155b29886","displayName":"QA 44c155b29886","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.910204954Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10c1ae1b-7018-4204-9db2-8a81b0d1d58c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10c1ae1b-7018-4204-9db2-8a81b0d1d58c
Content-Type: application/json

--- request body ---
{"handle":"qa-6ef3a32535a7","displayName":"QA 6ef3a32535a7","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-10c1ae1b-7018-4204-9db2-8a81b0d1d58c
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
Location: /v1/accounts/qa-6ef3a32535a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3aeb4004-0462-48ae-b8c5-286054ded940","handle":"qa-6ef3a32535a7","displayName":"QA 6ef3a32535a7","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.974225603Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-36a49e3d-c846-4545-b3cf-98fcd2623712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36a49e3d-c846-4545-b3cf-98fcd2623712
Content-Type: application/json

--- request body ---
{"handle":"qa-44c155b29886","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-36a49e3d-c846-4545-b3cf-98fcd2623712
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de12eb94-d494-4a77-8926-269692b49db9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d3cd7729-4533-4c74-b39c-ce58d20ad79b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3cd7729-4533-4c74-b39c-ce58d20ad79b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6ef3a32535a7","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3cd7729-4533-4c74-b39c-ce58d20ad79b
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
Location: /v1/conversations/cnv_2c2bda7b-a7bc-43e0-983e-ee195b4e4d5d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2c2bda7b-a7bc-43e0-983e-ee195b4e4d5d","subject":"Error contract","status":"open","region":"eu","participants":["qa-44c155b29886","qa-6ef3a32535a7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.049485474Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2c2bda7b-a7bc-43e0-983e-ee195b4e4d5d/messages
correlation: qa-e96f395b-4038-4fc5-a9fb-47c189a1a72c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a678b6fc-3c2b-4c0f-b5b2-0f974d20a680
X-Correlation-Id: qa-e96f395b-4038-4fc5-a9fb-47c189a1a72c
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e96f395b-4038-4fc5-a9fb-47c189a1a72c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2c2bda7b-a7bc-43e0-983e-ee195b4e4d5d/messages","correlationId":"qa-e96f395b-4038-4fc5-a9fb-47c189a1a72c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6059d69e-0085-4103-aff2-f8cfdd8dd702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6059d69e-0085-4103-aff2-f8cfdd8dd702
Content-Type: application/json

--- request body ---
{"handle":"qa-6ef3a32535a7","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6059d69e-0085-4103-aff2-f8cfdd8dd702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3aeb4004-0462-48ae-b8c5-286054ded940"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-457aa24a-f8bb-41d9-aac9-3dc66553ebd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-457aa24a-f8bb-41d9-aac9-3dc66553ebd2
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-457aa24a-f8bb-41d9-aac9-3dc66553ebd2
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
correlation: qa-af2e2bbe-3e5c-4722-8877-e667ac4d5a55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af2e2bbe-3e5c-4722-8877-e667ac4d5a55
Content-Type: application/json

--- request body ---
{"handle":"qa-6ef3a32535a7","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af2e2bbe-3e5c-4722-8877-e667ac4d5a55
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af2e2bbe-3e5c-4722-8877-e667ac4d5a55"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21c4c0b7-4389-49dc-9427-3448fdc7ec2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21c4c0b7-4389-49dc-9427-3448fdc7ec2a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21c4c0b7-4389-49dc-9427-3448fdc7ec2a
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
correlation: qa-1d737e5c-dd1e-41ac-afc6-4a64c5947dc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d737e5c-dd1e-41ac-afc6-4a64c5947dc4
Content-Type: application/json

--- request body ---
{"handle":"qa-44c155b29886","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d737e5c-dd1e-41ac-afc6-4a64c5947dc4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d737e5c-dd1e-41ac-afc6-4a64c5947dc4"}
```
