# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-46e542f9-0bba-4a4a-8917-4da4c7481914` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-1eed8900-c1d9-43ac-a3fd-a76a3266e976` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-05bc0466-97ac-4af6-9e60-ac1e2cd59ad1` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-bda7a093-6d40-48b6-b5fa-9500c740771a` |
| 5 | `POST /v1/conversations` | 503 | 16 | `qa-13c8d6d0-5dd9-47c0-9018-9f5394ea2d93` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-e0af96c8-f9cb-490c-9a26-64c1f6f2f33f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b5fd0333-490d-4639-b8ac-de9aa0f354db` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-ab2a4b67-9ad3-4be2-bc56-642b3670d724` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-89a921c4-a836-47ec-a22b-02f0b1080bec` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-55275869-d3c4-423c-a74e-80fbaeafa209` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-46e542f9-0bba-4a4a-8917-4da4c7481914

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46e542f9-0bba-4a4a-8917-4da4c7481914
Content-Type: application/json

--- request body ---
{"handle":"qa-10d8a889d058","displayName":"QA 10d8a889d058","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-46e542f9-0bba-4a4a-8917-4da4c7481914
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-10d8a889d058
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d6b91a0-344b-4f55-afd9-a3abb510a4fb","handle":"qa-10d8a889d058","displayName":"QA 10d8a889d058","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.637123131Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1eed8900-c1d9-43ac-a3fd-a76a3266e976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eed8900-c1d9-43ac-a3fd-a76a3266e976
Content-Type: application/json

--- request body ---
{"handle":"qa-57a9a0246884","displayName":"QA 57a9a0246884","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eed8900-c1d9-43ac-a3fd-a76a3266e976
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Location: /v1/accounts/qa-57a9a0246884
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1a55eda-d976-48ea-ac52-8ebc16502213","handle":"qa-57a9a0246884","displayName":"QA 57a9a0246884","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.697980410Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-05bc0466-97ac-4af6-9e60-ac1e2cd59ad1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05bc0466-97ac-4af6-9e60-ac1e2cd59ad1
Content-Type: application/json

--- request body ---
{"handle":"qa-10d8a889d058","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-05bc0466-97ac-4af6-9e60-ac1e2cd59ad1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d6b91a0-344b-4f55-afd9-a3abb510a4fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bda7a093-6d40-48b6-b5fa-9500c740771a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda7a093-6d40-48b6-b5fa-9500c740771a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-57a9a0246884","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bda7a093-6d40-48b6-b5fa-9500c740771a
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
Location: /v1/conversations/cnv_bc682513-6f02-42cb-adec-eae291dcc13c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bc682513-6f02-42cb-adec-eae291dcc13c","subject":"Error contract","status":"open","region":"eu","participants":["qa-10d8a889d058","qa-57a9a0246884"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.770339066Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-13c8d6d0-5dd9-47c0-9018-9f5394ea2d93

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4646581b-9174-47dd-9239-5c5c39002119
X-Correlation-Id: qa-13c8d6d0-5dd9-47c0-9018-9f5394ea2d93
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-10d8a889d058","subject":"Probe","message":"Hi"}

--- response: 503 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13c8d6d0-5dd9-47c0-9018-9f5394ea2d93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-13c8d6d0-5dd9-47c0-9018-9f5394ea2d93"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0af96c8-f9cb-490c-9a26-64c1f6f2f33f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0af96c8-f9cb-490c-9a26-64c1f6f2f33f
Content-Type: application/json

--- request body ---
{"handle":"qa-57a9a0246884","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0af96c8-f9cb-490c-9a26-64c1f6f2f33f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1a55eda-d976-48ea-ac52-8ebc16502213"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5fd0333-490d-4639-b8ac-de9aa0f354db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5fd0333-490d-4639-b8ac-de9aa0f354db
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5fd0333-490d-4639-b8ac-de9aa0f354db
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
correlation: qa-ab2a4b67-9ad3-4be2-bc56-642b3670d724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab2a4b67-9ad3-4be2-bc56-642b3670d724
Content-Type: application/json

--- request body ---
{"handle":"qa-57a9a0246884","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab2a4b67-9ad3-4be2-bc56-642b3670d724
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab2a4b67-9ad3-4be2-bc56-642b3670d724"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89a921c4-a836-47ec-a22b-02f0b1080bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89a921c4-a836-47ec-a22b-02f0b1080bec
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89a921c4-a836-47ec-a22b-02f0b1080bec
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
correlation: qa-55275869-d3c4-423c-a74e-80fbaeafa209

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55275869-d3c4-423c-a74e-80fbaeafa209
Content-Type: application/json

--- request body ---
{"handle":"qa-10d8a889d058","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55275869-d3c4-423c-a74e-80fbaeafa209
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55275869-d3c4-423c-a74e-80fbaeafa209"}
```
