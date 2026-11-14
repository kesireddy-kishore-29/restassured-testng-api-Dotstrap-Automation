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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-0934e286-e777-40b2-945f-04aee8fde6cf` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-40717a82-c856-45c5-9c6a-a4c764a80f5c` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-6318a3e9-b855-4b10-a2cc-7735a86baa68` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-feda9164-e193-48e3-9c65-ca6358ccb372` |
| 5 | `PATCH /v1/accounts/me` | 503 | 8 | `qa-fb897ab9-d075-4fa4-8bc7-e587ea65ea03` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-15e34169-a646-4c78-8e87-b752ae86942d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-3747f144-13ae-4ab5-880b-dc536b1697ed` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-ccf6fdab-3c1c-49c9-b9bb-e2865b0df2cc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-901bc15f-5954-440c-9851-fa6be25e826a` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-830a1b92-4536-4216-94bd-fd1d75b3f2cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0934e286-e777-40b2-945f-04aee8fde6cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0934e286-e777-40b2-945f-04aee8fde6cf
Content-Type: application/json

--- request body ---
{"handle":"qa-4b509402bed5","displayName":"QA 4b509402bed5","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0934e286-e777-40b2-945f-04aee8fde6cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-4b509402bed5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25746fee-6542-4718-8b6d-5a9f082c4b82","handle":"qa-4b509402bed5","displayName":"QA 4b509402bed5","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.899996986Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-40717a82-c856-45c5-9c6a-a4c764a80f5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40717a82-c856-45c5-9c6a-a4c764a80f5c
Content-Type: application/json

--- request body ---
{"handle":"qa-47755fa38478","displayName":"QA 47755fa38478","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-40717a82-c856-45c5-9c6a-a4c764a80f5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Location: /v1/accounts/qa-47755fa38478
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6740fbbe-c854-442d-9a43-34f949a8e3c9","handle":"qa-47755fa38478","displayName":"QA 47755fa38478","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.944194944Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6318a3e9-b855-4b10-a2cc-7735a86baa68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6318a3e9-b855-4b10-a2cc-7735a86baa68
Content-Type: application/json

--- request body ---
{"handle":"qa-4b509402bed5","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6318a3e9-b855-4b10-a2cc-7735a86baa68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25746fee-6542-4718-8b6d-5a9f082c4b82"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-feda9164-e193-48e3-9c65-ca6358ccb372

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feda9164-e193-48e3-9c65-ca6358ccb372
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-47755fa38478","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-feda9164-e193-48e3-9c65-ca6358ccb372
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
Location: /v1/conversations/cnv_abab41d1-b505-4047-a7aa-e631de2b98ca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_abab41d1-b505-4047-a7aa-e631de2b98ca","subject":"Error contract","status":"open","region":"eu","participants":["qa-4b509402bed5","qa-47755fa38478"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.994744823Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-fb897ab9-d075-4fa4-8bc7-e587ea65ea03

--- request headers ---
Accept: application/json
X-Fault-Key: d5959074-907f-4f2a-9201-051313709029
X-Fault: unavailable-once
X-Correlation-Id: qa-fb897ab9-d075-4fa4-8bc7-e587ea65ea03
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb897ab9-d075-4fa4-8bc7-e587ea65ea03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-fb897ab9-d075-4fa4-8bc7-e587ea65ea03"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-15e34169-a646-4c78-8e87-b752ae86942d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15e34169-a646-4c78-8e87-b752ae86942d
Content-Type: application/json

--- request body ---
{"handle":"qa-47755fa38478","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-15e34169-a646-4c78-8e87-b752ae86942d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6740fbbe-c854-442d-9a43-34f949a8e3c9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3747f144-13ae-4ab5-880b-dc536b1697ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3747f144-13ae-4ab5-880b-dc536b1697ed
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3747f144-13ae-4ab5-880b-dc536b1697ed
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
correlation: qa-ccf6fdab-3c1c-49c9-b9bb-e2865b0df2cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccf6fdab-3c1c-49c9-b9bb-e2865b0df2cc
Content-Type: application/json

--- request body ---
{"handle":"qa-47755fa38478","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccf6fdab-3c1c-49c9-b9bb-e2865b0df2cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccf6fdab-3c1c-49c9-b9bb-e2865b0df2cc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-901bc15f-5954-440c-9851-fa6be25e826a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-901bc15f-5954-440c-9851-fa6be25e826a
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-901bc15f-5954-440c-9851-fa6be25e826a
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
correlation: qa-830a1b92-4536-4216-94bd-fd1d75b3f2cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-830a1b92-4536-4216-94bd-fd1d75b3f2cf
Content-Type: application/json

--- request body ---
{"handle":"qa-4b509402bed5","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-830a1b92-4536-4216-94bd-fd1d75b3f2cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-830a1b92-4536-4216-94bd-fd1d75b3f2cf"}
```
