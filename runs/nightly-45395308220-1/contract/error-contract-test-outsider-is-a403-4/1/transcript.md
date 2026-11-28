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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-25c29bcc-261b-4b43-9771-86139c7cfa4f` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-5242b3f1-3d09-4df5-a184-950e35246944` |
| 3 | `POST /v1/accounts` | 201 | 17 | `qa-44dc115f-0222-4582-885d-a96ff8dad265` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-932e1307-99d7-48e3-96b6-036a2d9a36c1` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-85e81106-8d1a-4008-8a87-bec25ab8a77b` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-5d733483-b1ea-455d-a1d2-1a162bb1b242` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 13 | `qa-ff1e7050-8b35-4872-a320-2893bbaa90ff` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-fcebb58d-81cc-4fbf-b6f2-979c345eddc6` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-8bcc2367-d1c6-4e16-b2b0-8507a777aa6a` |
| 10 | `POST /v1/auth/token` | 200 | 27 | `qa-28e75ab9-216a-48f0-89e8-33162e716c2a` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-042c174f-39dd-4598-86a5-37afab43e966` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-3d09b64f-0164-4873-9cda-077333dda87d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6d31920a-74f5-4d30-b37f-731285ec0dc9` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-3e016c59-a4f8-4bcd-aeb7-f62594df32c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-25c29bcc-261b-4b43-9771-86139c7cfa4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c29bcc-261b-4b43-9771-86139c7cfa4f
Content-Type: application/json

--- request body ---
{"handle":"qa-0a194c77038f","displayName":"QA 0a194c77038f","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-25c29bcc-261b-4b43-9771-86139c7cfa4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-0a194c77038f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b450c7e-78d9-4408-a647-658ec9e5e032","handle":"qa-0a194c77038f","displayName":"QA 0a194c77038f","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.580347444Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5242b3f1-3d09-4df5-a184-950e35246944

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5242b3f1-3d09-4df5-a184-950e35246944
Content-Type: application/json

--- request body ---
{"handle":"qa-8bcb31ebf063","displayName":"QA 8bcb31ebf063","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5242b3f1-3d09-4df5-a184-950e35246944
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-8bcb31ebf063
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f398f2b0-1a48-422f-be7a-89f831630636","handle":"qa-8bcb31ebf063","displayName":"QA 8bcb31ebf063","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.616330868Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-44dc115f-0222-4582-885d-a96ff8dad265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44dc115f-0222-4582-885d-a96ff8dad265
Content-Type: application/json

--- request body ---
{"handle":"qa-0802cdbfc3c9","displayName":"QA 0802cdbfc3c9","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-44dc115f-0222-4582-885d-a96ff8dad265
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Location: /v1/accounts/qa-0802cdbfc3c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f911433-a44b-403e-a185-c730e9985003","handle":"qa-0802cdbfc3c9","displayName":"QA 0802cdbfc3c9","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.647830350Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-932e1307-99d7-48e3-96b6-036a2d9a36c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-932e1307-99d7-48e3-96b6-036a2d9a36c1
Content-Type: application/json

--- request body ---
{"handle":"qa-0a194c77038f","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-932e1307-99d7-48e3-96b6-036a2d9a36c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b450c7e-78d9-4408-a647-658ec9e5e032"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-85e81106-8d1a-4008-8a87-bec25ab8a77b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85e81106-8d1a-4008-8a87-bec25ab8a77b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8bcb31ebf063","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-85e81106-8d1a-4008-8a87-bec25ab8a77b
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
Location: /v1/conversations/cnv_41c89db6-8039-4c8c-aead-7689694937bf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_41c89db6-8039-4c8c-aead-7689694937bf","subject":"Error contract","status":"open","region":"eu","participants":["qa-0a194c77038f","qa-8bcb31ebf063"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.693858777Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5d733483-b1ea-455d-a1d2-1a162bb1b242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d733483-b1ea-455d-a1d2-1a162bb1b242
Content-Type: application/json

--- request body ---
{"handle":"qa-0802cdbfc3c9","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d733483-b1ea-455d-a1d2-1a162bb1b242
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f911433-a44b-403e-a185-c730e9985003"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_41c89db6-8039-4c8c-aead-7689694937bf/close
correlation: qa-ff1e7050-8b35-4872-a320-2893bbaa90ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1e7050-8b35-4872-a320-2893bbaa90ff
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff1e7050-8b35-4872-a320-2893bbaa90ff
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_41c89db6-8039-4c8c-aead-7689694937bf/close","correlationId":"qa-ff1e7050-8b35-4872-a320-2893bbaa90ff"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcebb58d-81cc-4fbf-b6f2-979c345eddc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcebb58d-81cc-4fbf-b6f2-979c345eddc6
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcebb58d-81cc-4fbf-b6f2-979c345eddc6
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
correlation: qa-8bcc2367-d1c6-4e16-b2b0-8507a777aa6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bcc2367-d1c6-4e16-b2b0-8507a777aa6a
Content-Type: application/json

--- request body ---
{"handle":"qa-0802cdbfc3c9","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bcc2367-d1c6-4e16-b2b0-8507a777aa6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bcc2367-d1c6-4e16-b2b0-8507a777aa6a"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-28e75ab9-216a-48f0-89e8-33162e716c2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28e75ab9-216a-48f0-89e8-33162e716c2a
Content-Type: application/json

--- request body ---
{"handle":"qa-8bcb31ebf063","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-28e75ab9-216a-48f0-89e8-33162e716c2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f398f2b0-1a48-422f-be7a-89f831630636"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-042c174f-39dd-4598-86a5-37afab43e966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-042c174f-39dd-4598-86a5-37afab43e966
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-042c174f-39dd-4598-86a5-37afab43e966
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
correlation: qa-3d09b64f-0164-4873-9cda-077333dda87d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d09b64f-0164-4873-9cda-077333dda87d
Content-Type: application/json

--- request body ---
{"handle":"qa-8bcb31ebf063","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d09b64f-0164-4873-9cda-077333dda87d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d09b64f-0164-4873-9cda-077333dda87d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d31920a-74f5-4d30-b37f-731285ec0dc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d31920a-74f5-4d30-b37f-731285ec0dc9
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d31920a-74f5-4d30-b37f-731285ec0dc9
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
correlation: qa-3e016c59-a4f8-4bcd-aeb7-f62594df32c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e016c59-a4f8-4bcd-aeb7-f62594df32c5
Content-Type: application/json

--- request body ---
{"handle":"qa-0a194c77038f","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e016c59-a4f8-4bcd-aeb7-f62594df32c5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e016c59-a4f8-4bcd-aeb7-f62594df32c5"}
```
