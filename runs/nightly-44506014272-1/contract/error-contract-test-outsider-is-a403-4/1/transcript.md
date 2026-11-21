# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-0af1d22c-8feb-46d5-a14e-32183dec6e09` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-1db2e515-da36-4366-9bed-2f4e6bf7ad5b` |
| 3 | `POST /v1/accounts` | 201 | 50 | `qa-d93a5925-b4a7-484d-bae0-7d676468112c` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-45476243-22b2-42c2-a9e6-bebbc31ac0ee` |
| 5 | `POST /v1/conversations` | 201 | 29 | `qa-cbc5a276-45b2-4410-a9df-762b90c8ffcf` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-56753f1d-fa49-4c13-ae86-69635f04cfdd` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 10 | `qa-93d2ed80-5337-4391-a0ea-4310650bd629` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-da951610-7a2a-41a0-8164-7a8d09f300a6` |
| 9 | `POST /v1/auth/token` | 401 | 38 | `qa-7b2f7573-5b62-4236-8c8b-bb8d738f4151` |
| 10 | `POST /v1/auth/token` | 200 | 50 | `qa-d33e7fd0-2cc1-49fe-b7c8-78a254c6bac0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-667e6183-cf0a-4581-9516-b68d366b0f41` |
| 12 | `POST /v1/auth/token` | 401 | 15 | `qa-0f8a8e55-1b0b-420d-bfc9-5e4a95eccbb7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-6c528a1f-72b5-4f63-8510-742fb8186a41` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-875d9407-d600-41eb-8e80-593e1716980c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0af1d22c-8feb-46d5-a14e-32183dec6e09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0af1d22c-8feb-46d5-a14e-32183dec6e09
Content-Type: application/json

--- request body ---
{"handle":"qa-0c07f7302f79","displayName":"QA 0c07f7302f79","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0af1d22c-8feb-46d5-a14e-32183dec6e09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 7
Location: /v1/accounts/qa-0c07f7302f79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1ef5905-8e0a-4d64-af8a-ef89594d2ab6","handle":"qa-0c07f7302f79","displayName":"QA 0c07f7302f79","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.459338330Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1db2e515-da36-4366-9bed-2f4e6bf7ad5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1db2e515-da36-4366-9bed-2f4e6bf7ad5b
Content-Type: application/json

--- request body ---
{"handle":"qa-56dd469e5676","displayName":"QA 56dd469e5676","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1db2e515-da36-4366-9bed-2f4e6bf7ad5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 7
Location: /v1/accounts/qa-56dd469e5676
X-Served-Region: eu
Content-Length: 181

{"id":"acc_933b4c7d-59b5-492e-b3bd-e202fd427b4f","handle":"qa-56dd469e5676","displayName":"QA 56dd469e5676","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.520285303Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d93a5925-b4a7-484d-bae0-7d676468112c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d93a5925-b4a7-484d-bae0-7d676468112c
Content-Type: application/json

--- request body ---
{"handle":"qa-02ced225c6e1","displayName":"QA 02ced225c6e1","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d93a5925-b4a7-484d-bae0-7d676468112c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Location: /v1/accounts/qa-02ced225c6e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ce679c7-e08a-4749-bea9-39cb0de86d39","handle":"qa-02ced225c6e1","displayName":"QA 02ced225c6e1","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.592113394Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-45476243-22b2-42c2-a9e6-bebbc31ac0ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45476243-22b2-42c2-a9e6-bebbc31ac0ee
Content-Type: application/json

--- request body ---
{"handle":"qa-0c07f7302f79","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-45476243-22b2-42c2-a9e6-bebbc31ac0ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1ef5905-8e0a-4d64-af8a-ef89594d2ab6"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cbc5a276-45b2-4410-a9df-762b90c8ffcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbc5a276-45b2-4410-a9df-762b90c8ffcf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-56dd469e5676","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbc5a276-45b2-4410-a9df-762b90c8ffcf
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
Location: /v1/conversations/cnv_78c16fee-e6d2-47ab-a67a-16d075a779bb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_78c16fee-e6d2-47ab-a67a-16d075a779bb","subject":"Error contract","status":"open","region":"eu","participants":["qa-0c07f7302f79","qa-56dd469e5676"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.700446024Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-56753f1d-fa49-4c13-ae86-69635f04cfdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56753f1d-fa49-4c13-ae86-69635f04cfdd
Content-Type: application/json

--- request body ---
{"handle":"qa-02ced225c6e1","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-56753f1d-fa49-4c13-ae86-69635f04cfdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ce679c7-e08a-4749-bea9-39cb0de86d39"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_78c16fee-e6d2-47ab-a67a-16d075a779bb/close
correlation: qa-93d2ed80-5337-4391-a0ea-4310650bd629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d2ed80-5337-4391-a0ea-4310650bd629
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93d2ed80-5337-4391-a0ea-4310650bd629
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_78c16fee-e6d2-47ab-a67a-16d075a779bb/close","correlationId":"qa-93d2ed80-5337-4391-a0ea-4310650bd629"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da951610-7a2a-41a0-8164-7a8d09f300a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da951610-7a2a-41a0-8164-7a8d09f300a6
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da951610-7a2a-41a0-8164-7a8d09f300a6
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-7b2f7573-5b62-4236-8c8b-bb8d738f4151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b2f7573-5b62-4236-8c8b-bb8d738f4151
Content-Type: application/json

--- request body ---
{"handle":"qa-02ced225c6e1","password":"****"}

--- response: 401 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b2f7573-5b62-4236-8c8b-bb8d738f4151
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b2f7573-5b62-4236-8c8b-bb8d738f4151"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d33e7fd0-2cc1-49fe-b7c8-78a254c6bac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d33e7fd0-2cc1-49fe-b7c8-78a254c6bac0
Content-Type: application/json

--- request body ---
{"handle":"qa-56dd469e5676","password":"****"}

--- response: 200 in 50 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d33e7fd0-2cc1-49fe-b7c8-78a254c6bac0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_933b4c7d-59b5-492e-b3bd-e202fd427b4f"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-667e6183-cf0a-4581-9516-b68d366b0f41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-667e6183-cf0a-4581-9516-b68d366b0f41
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-667e6183-cf0a-4581-9516-b68d366b0f41
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-0f8a8e55-1b0b-420d-bfc9-5e4a95eccbb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f8a8e55-1b0b-420d-bfc9-5e4a95eccbb7
Content-Type: application/json

--- request body ---
{"handle":"qa-56dd469e5676","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f8a8e55-1b0b-420d-bfc9-5e4a95eccbb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f8a8e55-1b0b-420d-bfc9-5e4a95eccbb7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c528a1f-72b5-4f63-8510-742fb8186a41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c528a1f-72b5-4f63-8510-742fb8186a41
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c528a1f-72b5-4f63-8510-742fb8186a41
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-875d9407-d600-41eb-8e80-593e1716980c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-875d9407-d600-41eb-8e80-593e1716980c
Content-Type: application/json

--- request body ---
{"handle":"qa-0c07f7302f79","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-875d9407-d600-41eb-8e80-593e1716980c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-875d9407-d600-41eb-8e80-593e1716980c"}
```
