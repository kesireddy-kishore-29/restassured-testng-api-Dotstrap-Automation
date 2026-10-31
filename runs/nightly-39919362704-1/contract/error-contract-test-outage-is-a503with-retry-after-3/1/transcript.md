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
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-e184eb9a-1107-42de-8770-ee3082d91515` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-fedf7cc2-e4cf-45ae-ac67-fba69e93c8c1` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-321e85e7-6596-42da-a667-b8b25dadbb47` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-88a671e7-0343-41a8-a474-c00c690d0530` |
| 5 | `PATCH /v1/accounts/me` | 503 | 33 | `qa-6d83c80e-b576-49e6-9550-b03dafc45e60` |
| 6 | `POST /v1/auth/token` | 200 | 65 | `qa-6a8d5e5a-4a09-481f-b9ed-617c58fc8a46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-f0489b6a-d69e-423b-872a-5bd53724c23f` |
| 8 | `POST /v1/auth/token` | 401 | 86 | `qa-b6a10091-061c-481e-9ea8-5eacf460d57e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-365f105a-8a4c-458d-9c44-4b3dd16a39d8` |
| 10 | `POST /v1/auth/token` | 401 | 39 | `qa-a44fabbd-2eef-47ed-a8bd-0418a698aa4a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e184eb9a-1107-42de-8770-ee3082d91515

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e184eb9a-1107-42de-8770-ee3082d91515
Content-Type: application/json

--- request body ---
{"handle":"qa-2638fc62279d","displayName":"QA 2638fc62279d","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-e184eb9a-1107-42de-8770-ee3082d91515
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-2638fc62279d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f13154b-7817-46c8-a656-a82a3eb6eb74","handle":"qa-2638fc62279d","displayName":"QA 2638fc62279d","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.765074835Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fedf7cc2-e4cf-45ae-ac67-fba69e93c8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fedf7cc2-e4cf-45ae-ac67-fba69e93c8c1
Content-Type: application/json

--- request body ---
{"handle":"qa-ad055edafa0d","displayName":"QA ad055edafa0d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fedf7cc2-e4cf-45ae-ac67-fba69e93c8c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-ad055edafa0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edbbdd5d-ecea-4e3f-890a-649ac9f768bc","handle":"qa-ad055edafa0d","displayName":"QA ad055edafa0d","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.825525836Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-321e85e7-6596-42da-a667-b8b25dadbb47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-321e85e7-6596-42da-a667-b8b25dadbb47
Content-Type: application/json

--- request body ---
{"handle":"qa-2638fc62279d","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-321e85e7-6596-42da-a667-b8b25dadbb47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f13154b-7817-46c8-a656-a82a3eb6eb74"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-88a671e7-0343-41a8-a474-c00c690d0530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88a671e7-0343-41a8-a474-c00c690d0530
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ad055edafa0d","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-88a671e7-0343-41a8-a474-c00c690d0530
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
Location: /v1/conversations/cnv_afa85590-82eb-4968-aa09-05f138d440b3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_afa85590-82eb-4968-aa09-05f138d440b3","subject":"Error contract","status":"open","region":"eu","participants":["qa-2638fc62279d","qa-ad055edafa0d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.904897369Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6d83c80e-b576-49e6-9550-b03dafc45e60

--- request headers ---
Accept: application/json
X-Fault-Key: 86d4d84c-2665-4811-b287-bcc036cfd98e
X-Fault: unavailable-once
X-Correlation-Id: qa-6d83c80e-b576-49e6-9550-b03dafc45e60
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d83c80e-b576-49e6-9550-b03dafc45e60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-6d83c80e-b576-49e6-9550-b03dafc45e60"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6a8d5e5a-4a09-481f-b9ed-617c58fc8a46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8d5e5a-4a09-481f-b9ed-617c58fc8a46
Content-Type: application/json

--- request body ---
{"handle":"qa-ad055edafa0d","password":"****"}

--- response: 200 in 65 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a8d5e5a-4a09-481f-b9ed-617c58fc8a46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edbbdd5d-ecea-4e3f-890a-649ac9f768bc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0489b6a-d69e-423b-872a-5bd53724c23f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0489b6a-d69e-423b-872a-5bd53724c23f
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0489b6a-d69e-423b-872a-5bd53724c23f
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
correlation: qa-b6a10091-061c-481e-9ea8-5eacf460d57e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6a10091-061c-481e-9ea8-5eacf460d57e
Content-Type: application/json

--- request body ---
{"handle":"qa-ad055edafa0d","password":"****"}

--- response: 401 in 86 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6a10091-061c-481e-9ea8-5eacf460d57e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6a10091-061c-481e-9ea8-5eacf460d57e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-365f105a-8a4c-458d-9c44-4b3dd16a39d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-365f105a-8a4c-458d-9c44-4b3dd16a39d8
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-365f105a-8a4c-458d-9c44-4b3dd16a39d8
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
correlation: qa-a44fabbd-2eef-47ed-a8bd-0418a698aa4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a44fabbd-2eef-47ed-a8bd-0418a698aa4a
Content-Type: application/json

--- request body ---
{"handle":"qa-2638fc62279d","password":"****"}

--- response: 401 in 39 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a44fabbd-2eef-47ed-a8bd-0418a698aa4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a44fabbd-2eef-47ed-a8bd-0418a698aa4a"}
```
