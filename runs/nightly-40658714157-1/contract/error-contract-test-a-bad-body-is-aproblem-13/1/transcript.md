# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-2d9012c8-61c6-4373-87a3-0e6fe6a36c3c` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-68f1634d-ec35-4fe1-8413-095f5beca10b` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-3400aca6-d83d-40d3-a389-337b7c51aca9` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-a4a09daa-b206-454a-bf90-f52785ec96ff` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 7 | `qa-311e3913-3c0d-48b5-8be8-45e40c3d1d70` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-93b60963-cf27-46a4-ade0-f5a6bdb48739` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-04369b8b-bfd3-418c-94db-2ffe5d2e783f` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-48b0abf0-309b-4b8a-8825-7cc1172b6166` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-6745461b-53f4-439e-b2cd-356389c696f9` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-9217256f-a431-4fc9-a45a-c8aa1c980edd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d9012c8-61c6-4373-87a3-0e6fe6a36c3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d9012c8-61c6-4373-87a3-0e6fe6a36c3c
Content-Type: application/json

--- request body ---
{"handle":"qa-da90f578a1a9","displayName":"QA da90f578a1a9","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d9012c8-61c6-4373-87a3-0e6fe6a36c3c
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
Location: /v1/accounts/qa-da90f578a1a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18a7e300-15fa-447e-a2f6-1b5d214f51f4","handle":"qa-da90f578a1a9","displayName":"QA da90f578a1a9","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.044806107Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-68f1634d-ec35-4fe1-8413-095f5beca10b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f1634d-ec35-4fe1-8413-095f5beca10b
Content-Type: application/json

--- request body ---
{"handle":"qa-699079c88445","displayName":"QA 699079c88445","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f1634d-ec35-4fe1-8413-095f5beca10b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Location: /v1/accounts/qa-699079c88445
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e7107fb-e391-411e-b868-efcf99fd3b13","handle":"qa-699079c88445","displayName":"QA 699079c88445","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.068049579Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3400aca6-d83d-40d3-a389-337b7c51aca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3400aca6-d83d-40d3-a389-337b7c51aca9
Content-Type: application/json

--- request body ---
{"handle":"qa-da90f578a1a9","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3400aca6-d83d-40d3-a389-337b7c51aca9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18a7e300-15fa-447e-a2f6-1b5d214f51f4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a4a09daa-b206-454a-bf90-f52785ec96ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4a09daa-b206-454a-bf90-f52785ec96ff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-699079c88445","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4a09daa-b206-454a-bf90-f52785ec96ff
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
Location: /v1/conversations/cnv_a55dd6e4-6de1-445b-81b5-9eab3a3196a9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a55dd6e4-6de1-445b-81b5-9eab3a3196a9","subject":"Error contract","status":"open","region":"eu","participants":["qa-da90f578a1a9","qa-699079c88445"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.108003685Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a55dd6e4-6de1-445b-81b5-9eab3a3196a9/messages
correlation: qa-311e3913-3c0d-48b5-8be8-45e40c3d1d70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-311e3913-3c0d-48b5-8be8-45e40c3d1d70
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-311e3913-3c0d-48b5-8be8-45e40c3d1d70
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_a55dd6e4-6de1-445b-81b5-9eab3a3196a9/messages","correlationId":"qa-311e3913-3c0d-48b5-8be8-45e40c3d1d70"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-93b60963-cf27-46a4-ade0-f5a6bdb48739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93b60963-cf27-46a4-ade0-f5a6bdb48739
Content-Type: application/json

--- request body ---
{"handle":"qa-699079c88445","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-93b60963-cf27-46a4-ade0-f5a6bdb48739
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e7107fb-e391-411e-b868-efcf99fd3b13"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04369b8b-bfd3-418c-94db-2ffe5d2e783f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04369b8b-bfd3-418c-94db-2ffe5d2e783f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04369b8b-bfd3-418c-94db-2ffe5d2e783f
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
correlation: qa-48b0abf0-309b-4b8a-8825-7cc1172b6166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b0abf0-309b-4b8a-8825-7cc1172b6166
Content-Type: application/json

--- request body ---
{"handle":"qa-699079c88445","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48b0abf0-309b-4b8a-8825-7cc1172b6166
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48b0abf0-309b-4b8a-8825-7cc1172b6166"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6745461b-53f4-439e-b2cd-356389c696f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6745461b-53f4-439e-b2cd-356389c696f9
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6745461b-53f4-439e-b2cd-356389c696f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9217256f-a431-4fc9-a45a-c8aa1c980edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9217256f-a431-4fc9-a45a-c8aa1c980edd
Content-Type: application/json

--- request body ---
{"handle":"qa-da90f578a1a9","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9217256f-a431-4fc9-a45a-c8aa1c980edd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9217256f-a431-4fc9-a45a-c8aa1c980edd"}
```
