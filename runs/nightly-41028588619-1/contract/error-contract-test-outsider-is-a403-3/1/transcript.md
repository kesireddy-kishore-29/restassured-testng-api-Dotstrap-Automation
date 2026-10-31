# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 476 | `qa-20a40594-f20f-48f2-96a3-c5bae6b27fc4` |
| 2 | `POST /v1/accounts` | 201 | 72 | `qa-10690ba9-befc-4b9f-9cb5-7c39079a647b` |
| 3 | `POST /v1/accounts` | 201 | 40 | `qa-ca8801f8-79e0-4b3d-b9e9-46730b3c81bf` |
| 4 | `POST /v1/auth/token` | 200 | 41 | `qa-9a8b6eb0-3047-4140-9f7a-d2e5f6a77ba4` |
| 5 | `POST /v1/conversations` | 201 | 71 | `qa-3a19f479-064f-4317-9d47-90e6af0f03e1` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-fde5b23e-816a-4852-92ef-a1aa7de2d8aa` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 26 | `qa-aab30026-a858-45e5-a47d-bba8c5320342` |
| 8 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-65dd5b71-ca0d-47be-ade7-331418c388ac` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-3538ebb3-dfab-44e6-9e79-c77f4a825ee5` |
| 10 | `POST /v1/auth/token` | 200 | 26 | `qa-02047d96-5dcd-4e3a-9b9c-cdaea4523543` |
| 11 | `DELETE /v1/accounts/me` | 204 | 55 | `qa-96a8faf2-c68a-4cab-90b2-62434a45cd07` |
| 12 | `POST /v1/auth/token` | 401 | 44 | `qa-5cc891fc-4643-42d6-b10e-0b5e43a56d67` |
| 13 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-49e83ca4-4e95-442b-a3cf-47acd42e5a12` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-4d8aeecb-e708-4e79-a451-bfa46fcb53cd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-20a40594-f20f-48f2-96a3-c5bae6b27fc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20a40594-f20f-48f2-96a3-c5bae6b27fc4
Content-Type: application/json

--- request body ---
{"handle":"qa-550b134293ce","displayName":"QA 550b134293ce","password":"****","region":"eu"}

--- response: 201 in 476 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-20a40594-f20f-48f2-96a3-c5bae6b27fc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Location: /v1/accounts/qa-550b134293ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e225fb92-301e-4192-b256-e5c6193d16dd","handle":"qa-550b134293ce","displayName":"QA 550b134293ce","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.424830004Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10690ba9-befc-4b9f-9cb5-7c39079a647b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10690ba9-befc-4b9f-9cb5-7c39079a647b
Content-Type: application/json

--- request body ---
{"handle":"qa-71a1f29acc12","displayName":"QA 71a1f29acc12","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-10690ba9-befc-4b9f-9cb5-7c39079a647b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-71a1f29acc12
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56d7236c-7556-4195-8364-7a5c7c091732","handle":"qa-71a1f29acc12","displayName":"QA 71a1f29acc12","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.881518873Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ca8801f8-79e0-4b3d-b9e9-46730b3c81bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca8801f8-79e0-4b3d-b9e9-46730b3c81bf
Content-Type: application/json

--- request body ---
{"handle":"qa-d986b251e020","displayName":"QA d986b251e020","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca8801f8-79e0-4b3d-b9e9-46730b3c81bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-d986b251e020
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2bc26dd9-de4d-47f7-ad3f-0c5605562737","handle":"qa-d986b251e020","displayName":"QA d986b251e020","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.996500267Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9a8b6eb0-3047-4140-9f7a-d2e5f6a77ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a8b6eb0-3047-4140-9f7a-d2e5f6a77ba4
Content-Type: application/json

--- request body ---
{"handle":"qa-550b134293ce","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a8b6eb0-3047-4140-9f7a-d2e5f6a77ba4
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e225fb92-301e-4192-b256-e5c6193d16dd"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3a19f479-064f-4317-9d47-90e6af0f03e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a19f479-064f-4317-9d47-90e6af0f03e1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-71a1f29acc12","subject":"Error contract","message":"Hi"}

--- response: 201 in 71 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a19f479-064f-4317-9d47-90e6af0f03e1
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
Location: /v1/conversations/cnv_0c99ea85-2079-4252-a03a-e562fb64a851
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0c99ea85-2079-4252-a03a-e562fb64a851","subject":"Error contract","status":"open","region":"eu","participants":["qa-550b134293ce","qa-71a1f29acc12"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.198791678Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fde5b23e-816a-4852-92ef-a1aa7de2d8aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fde5b23e-816a-4852-92ef-a1aa7de2d8aa
Content-Type: application/json

--- request body ---
{"handle":"qa-d986b251e020","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fde5b23e-816a-4852-92ef-a1aa7de2d8aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2bc26dd9-de4d-47f7-ad3f-0c5605562737"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0c99ea85-2079-4252-a03a-e562fb64a851/read
correlation: qa-aab30026-a858-45e5-a47d-bba8c5320342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aab30026-a858-45e5-a47d-bba8c5320342
Content-Type: application/json

--- response: 403 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aab30026-a858-45e5-a47d-bba8c5320342
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0c99ea85-2079-4252-a03a-e562fb64a851/read","correlationId":"qa-aab30026-a858-45e5-a47d-bba8c5320342"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65dd5b71-ca0d-47be-ade7-331418c388ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65dd5b71-ca0d-47be-ade7-331418c388ac
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65dd5b71-ca0d-47be-ade7-331418c388ac
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
correlation: qa-3538ebb3-dfab-44e6-9e79-c77f4a825ee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3538ebb3-dfab-44e6-9e79-c77f4a825ee5
Content-Type: application/json

--- request body ---
{"handle":"qa-d986b251e020","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3538ebb3-dfab-44e6-9e79-c77f4a825ee5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3538ebb3-dfab-44e6-9e79-c77f4a825ee5"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-02047d96-5dcd-4e3a-9b9c-cdaea4523543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02047d96-5dcd-4e3a-9b9c-cdaea4523543
Content-Type: application/json

--- request body ---
{"handle":"qa-71a1f29acc12","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-02047d96-5dcd-4e3a-9b9c-cdaea4523543
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56d7236c-7556-4195-8364-7a5c7c091732"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96a8faf2-c68a-4cab-90b2-62434a45cd07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96a8faf2-c68a-4cab-90b2-62434a45cd07
Content-Type: application/json

--- response: 204 in 55 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96a8faf2-c68a-4cab-90b2-62434a45cd07
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
correlation: qa-5cc891fc-4643-42d6-b10e-0b5e43a56d67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cc891fc-4643-42d6-b10e-0b5e43a56d67
Content-Type: application/json

--- request body ---
{"handle":"qa-71a1f29acc12","password":"****"}

--- response: 401 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cc891fc-4643-42d6-b10e-0b5e43a56d67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5cc891fc-4643-42d6-b10e-0b5e43a56d67"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49e83ca4-4e95-442b-a3cf-47acd42e5a12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49e83ca4-4e95-442b-a3cf-47acd42e5a12
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49e83ca4-4e95-442b-a3cf-47acd42e5a12
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4d8aeecb-e708-4e79-a451-bfa46fcb53cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d8aeecb-e708-4e79-a451-bfa46fcb53cd
Content-Type: application/json

--- request body ---
{"handle":"qa-550b134293ce","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d8aeecb-e708-4e79-a451-bfa46fcb53cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d8aeecb-e708-4e79-a451-bfa46fcb53cd"}
```
