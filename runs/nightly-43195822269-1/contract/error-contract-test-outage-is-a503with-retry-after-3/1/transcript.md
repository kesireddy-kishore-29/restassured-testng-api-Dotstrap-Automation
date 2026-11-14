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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-f76bf84f-d971-4b2b-94a4-2643bac357ac` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-c91f235b-0852-434d-9ce3-633b79d71413` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-2acb0bcc-d9e3-426e-80ad-caf6673e2e02` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-31404e73-5187-4933-a7aa-8e793b7dab92` |
| 5 | `PATCH /v1/accounts/me` | 503 | 11 | `qa-139bea3e-bafe-4493-a0b7-4f4f0e0616e9` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-7e9800be-0ca0-403d-a503-9351b1a70843` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-9503393b-a25a-4c18-b079-b80710685703` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-a557fbdc-ed73-4665-afae-3e61e728a6e0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-768756a1-e67e-44f8-9fe2-c850587bd93a` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-ce2fcaa7-89a7-4eb6-8c42-04e60619acf2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f76bf84f-d971-4b2b-94a4-2643bac357ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f76bf84f-d971-4b2b-94a4-2643bac357ac
Content-Type: application/json

--- request body ---
{"handle":"qa-b7cd367a55db","displayName":"QA b7cd367a55db","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f76bf84f-d971-4b2b-94a4-2643bac357ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-b7cd367a55db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90aec01a-81c3-4705-a997-20a886e6d836","handle":"qa-b7cd367a55db","displayName":"QA b7cd367a55db","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.059793640Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c91f235b-0852-434d-9ce3-633b79d71413

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c91f235b-0852-434d-9ce3-633b79d71413
Content-Type: application/json

--- request body ---
{"handle":"qa-40aa043952cb","displayName":"QA 40aa043952cb","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c91f235b-0852-434d-9ce3-633b79d71413
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-40aa043952cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f62065cf-b627-4083-9fb9-33dcda82f23f","handle":"qa-40aa043952cb","displayName":"QA 40aa043952cb","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.079901742Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2acb0bcc-d9e3-426e-80ad-caf6673e2e02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2acb0bcc-d9e3-426e-80ad-caf6673e2e02
Content-Type: application/json

--- request body ---
{"handle":"qa-b7cd367a55db","password":"****"}

--- response: 200 in 52 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2acb0bcc-d9e3-426e-80ad-caf6673e2e02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90aec01a-81c3-4705-a997-20a886e6d836"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-31404e73-5187-4933-a7aa-8e793b7dab92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31404e73-5187-4933-a7aa-8e793b7dab92
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-40aa043952cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-31404e73-5187-4933-a7aa-8e793b7dab92
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
Location: /v1/conversations/cnv_80c9ccac-2b2e-407d-8872-7f96fcb6ed77
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_80c9ccac-2b2e-407d-8872-7f96fcb6ed77","subject":"Error contract","status":"open","region":"eu","participants":["qa-b7cd367a55db","qa-40aa043952cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.172782932Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-139bea3e-bafe-4493-a0b7-4f4f0e0616e9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d2dffac7-fe60-4d99-9906-8a298c5d0d02
X-Correlation-Id: qa-139bea3e-bafe-4493-a0b7-4f4f0e0616e9
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-139bea3e-bafe-4493-a0b7-4f4f0e0616e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-139bea3e-bafe-4493-a0b7-4f4f0e0616e9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7e9800be-0ca0-403d-a503-9351b1a70843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e9800be-0ca0-403d-a503-9351b1a70843
Content-Type: application/json

--- request body ---
{"handle":"qa-40aa043952cb","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e9800be-0ca0-403d-a503-9351b1a70843
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f62065cf-b627-4083-9fb9-33dcda82f23f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9503393b-a25a-4c18-b079-b80710685703

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9503393b-a25a-4c18-b079-b80710685703
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9503393b-a25a-4c18-b079-b80710685703
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
correlation: qa-a557fbdc-ed73-4665-afae-3e61e728a6e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a557fbdc-ed73-4665-afae-3e61e728a6e0
Content-Type: application/json

--- request body ---
{"handle":"qa-40aa043952cb","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a557fbdc-ed73-4665-afae-3e61e728a6e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a557fbdc-ed73-4665-afae-3e61e728a6e0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-768756a1-e67e-44f8-9fe2-c850587bd93a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-768756a1-e67e-44f8-9fe2-c850587bd93a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-768756a1-e67e-44f8-9fe2-c850587bd93a
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
correlation: qa-ce2fcaa7-89a7-4eb6-8c42-04e60619acf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce2fcaa7-89a7-4eb6-8c42-04e60619acf2
Content-Type: application/json

--- request body ---
{"handle":"qa-b7cd367a55db","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce2fcaa7-89a7-4eb6-8c42-04e60619acf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce2fcaa7-89a7-4eb6-8c42-04e60619acf2"}
```
