# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-34731c06-15dd-4189-9998-853ac9d80ad9` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-36dd4c8e-5cf7-4eed-9fbd-db7dd8e522c4` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-8bab41dd-52fd-4550-a603-d8cca2567556` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-e15f50e6-0ae4-4125-a5f2-2b9a1de16b69` |
| 5 | `GET /v1/conversations` | 503 | 10 | `qa-93b476f0-5d99-4b7a-94c0-cc48414c5554` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-c261561d-1e92-4c7f-82b2-a2bac7549e48` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f3ac3cbd-4b3b-498a-98e0-6e41b1722785` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-f8068fdf-2073-45c2-b769-ee22c18470ca` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d620dbd7-cabc-4cad-9b4f-5e2aa65580d3` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-0134efa7-32b8-420b-b92b-487ecb95576a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34731c06-15dd-4189-9998-853ac9d80ad9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34731c06-15dd-4189-9998-853ac9d80ad9
Content-Type: application/json

--- request body ---
{"handle":"qa-364e8ba5b089","displayName":"QA 364e8ba5b089","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-34731c06-15dd-4189-9998-853ac9d80ad9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 9
Location: /v1/accounts/qa-364e8ba5b089
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1653a4f7-a0b8-48d9-895f-e3302e805f1f","handle":"qa-364e8ba5b089","displayName":"QA 364e8ba5b089","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.998474661Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-36dd4c8e-5cf7-4eed-9fbd-db7dd8e522c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36dd4c8e-5cf7-4eed-9fbd-db7dd8e522c4
Content-Type: application/json

--- request body ---
{"handle":"qa-c212e8d16fcf","displayName":"QA c212e8d16fcf","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-36dd4c8e-5cf7-4eed-9fbd-db7dd8e522c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 9
Location: /v1/accounts/qa-c212e8d16fcf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9721860d-37df-4d89-93b2-17c744e5323a","handle":"qa-c212e8d16fcf","displayName":"QA c212e8d16fcf","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.036605447Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8bab41dd-52fd-4550-a603-d8cca2567556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bab41dd-52fd-4550-a603-d8cca2567556
Content-Type: application/json

--- request body ---
{"handle":"qa-364e8ba5b089","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bab41dd-52fd-4550-a603-d8cca2567556
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1653a4f7-a0b8-48d9-895f-e3302e805f1f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e15f50e6-0ae4-4125-a5f2-2b9a1de16b69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e15f50e6-0ae4-4125-a5f2-2b9a1de16b69
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c212e8d16fcf","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e15f50e6-0ae4-4125-a5f2-2b9a1de16b69
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
Location: /v1/conversations/cnv_9b0f2192-a75b-4505-9719-b9fc05511b41
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9b0f2192-a75b-4505-9719-b9fc05511b41","subject":"Error contract","status":"open","region":"eu","participants":["qa-364e8ba5b089","qa-c212e8d16fcf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.081451228Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-93b476f0-5d99-4b7a-94c0-cc48414c5554

--- request headers ---
Accept: application/json
X-Fault-Key: 5612d20a-16e3-4e48-8ad2-2b8fa4d06a31
X-Fault: unavailable-once
X-Correlation-Id: qa-93b476f0-5d99-4b7a-94c0-cc48414c5554
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93b476f0-5d99-4b7a-94c0-cc48414c5554
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-93b476f0-5d99-4b7a-94c0-cc48414c5554"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c261561d-1e92-4c7f-82b2-a2bac7549e48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c261561d-1e92-4c7f-82b2-a2bac7549e48
Content-Type: application/json

--- request body ---
{"handle":"qa-c212e8d16fcf","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c261561d-1e92-4c7f-82b2-a2bac7549e48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9721860d-37df-4d89-93b2-17c744e5323a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3ac3cbd-4b3b-498a-98e0-6e41b1722785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ac3cbd-4b3b-498a-98e0-6e41b1722785
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3ac3cbd-4b3b-498a-98e0-6e41b1722785
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
correlation: qa-f8068fdf-2073-45c2-b769-ee22c18470ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8068fdf-2073-45c2-b769-ee22c18470ca
Content-Type: application/json

--- request body ---
{"handle":"qa-c212e8d16fcf","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8068fdf-2073-45c2-b769-ee22c18470ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8068fdf-2073-45c2-b769-ee22c18470ca"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d620dbd7-cabc-4cad-9b4f-5e2aa65580d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d620dbd7-cabc-4cad-9b4f-5e2aa65580d3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d620dbd7-cabc-4cad-9b4f-5e2aa65580d3
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
correlation: qa-0134efa7-32b8-420b-b92b-487ecb95576a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0134efa7-32b8-420b-b92b-487ecb95576a
Content-Type: application/json

--- request body ---
{"handle":"qa-364e8ba5b089","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0134efa7-32b8-420b-b92b-487ecb95576a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0134efa7-32b8-420b-b92b-487ecb95576a"}
```
