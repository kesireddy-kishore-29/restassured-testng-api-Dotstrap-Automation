# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 379 | `qa-b9a6cb2e-d1e2-4df6-a3af-3a4534896f3c` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-3f74ef88-3f3d-4a32-970a-17c3a5eb231d` |
| 3 | `GET /v1/accounts/me` | 200 | 36 | `qa-2cac1b88-ab4f-4b65-9bba-76bea8117121` |
| 4 | `GET /v1/accounts/me` | 200 | 20 | `qa-a0c5f8bc-da4d-461c-a189-53fc175a7787` |
| 5 | `GET /v1/accounts/me` | 200 | 23 | `qa-c78e4930-30cb-45fe-941d-3313d3487db3` |
| 6 | `GET /v1/accounts/me` | 200 | 13 | `qa-b922ebf6-342d-4d56-8933-ba4fe89ca199` |
| 7 | `GET /v1/accounts/me` | 200 | 15 | `qa-a66c8ac6-4eb3-4edc-b434-530b0358f9a2` |
| 8 | `GET /v1/accounts/me` | 200 | 18 | `qa-a6c4504a-70bb-40a8-be49-acc779301b85` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-43001731-9f20-404c-9b82-23b3cf92bec9` |
| 10 | `GET /v1/accounts/me` | 200 | 9 | `qa-2d1ba62d-36ca-4853-81c1-39512551a7d0` |
| 11 | `GET /v1/accounts/me` | 200 | 19 | `qa-bec1367e-a52d-475c-b075-153e12260b21` |
| 12 | `GET /v1/accounts/me` | 200 | 8 | `qa-93c9a45c-07a2-4191-90d5-2ebfa2cc71f4` |
| 13 | `GET /v1/accounts/me` | 200 | 11 | `qa-0d809974-a143-42f0-a8af-a0330d5d64eb` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-b408c2fb-e6ce-4021-ae1b-75cf18603ae6` |
| 15 | `GET /v1/accounts/me` | 200 | 17 | `qa-24b8411b-2036-4136-a5da-a1795246d1de` |
| 16 | `GET /v1/accounts/me` | 200 | 10 | `qa-e8d83860-2864-4425-8872-262734b70964` |
| 17 | `GET /v1/accounts/me` | 200 | 14 | `qa-24273328-6888-4175-b50b-05dd872f9225` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-9373e642-16c2-4061-af2b-e727532b21f6` |
| 19 | `GET /v1/accounts/me` | 200 | 7 | `qa-cab88be8-351e-4819-82bd-cd63ecd3cdcd` |
| 20 | `GET /v1/accounts/me` | 200 | 21 | `qa-18d76556-2208-4012-8825-9054cf41a935` |
| 21 | `GET /v1/accounts/me` | 200 | 10 | `qa-a2d5de85-f444-4f1b-962a-24d76fa89eb9` |
| 22 | `GET /v1/accounts/me` | 200 | 9 | `qa-b290461c-642d-4566-ad9d-bd55b996eaf5` |
| 23 | `GET /v1/accounts/me` | 200 | 11 | `qa-a510b4c9-467e-4f06-add1-3803b1718829` |
| 24 | `GET /v1/accounts/me` | 200 | 10 | `qa-ffaedd30-b567-47ef-9778-709ad17fdf9f` |
| 25 | `GET /v1/accounts/me` | 200 | 7 | `qa-40f79d30-f656-4591-ad15-7f9b5e587cca` |
| 26 | `GET /v1/accounts/me` | 200 | 8 | `qa-e502c13a-ac6f-4317-91b2-e45c22fd4ea9` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-e1a6ac26-4eef-4147-ad6d-1444bf1c354d` |
| 28 | `GET /v1/accounts/me` | 200 | 13 | `qa-97d787b1-e2f9-4e2a-8479-2a940ec93906` |
| 29 | `GET /v1/accounts/me` | 200 | 14 | `qa-f81d3f6e-d41f-489a-914f-69a959e1ac09` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-00a4825d-98cb-4b97-be5b-99ae9924aa12` |
| 31 | `GET /v1/accounts/me` | 200 | 15 | `qa-1315bf63-e716-454a-b17b-aece4c528052` |
| 32 | `GET /v1/accounts/me` | 200 | 7 | `qa-48812cb9-bd3d-46a5-96d3-9b914d1cae3d` |
| 33 | `GET /v1/accounts/me` | 200 | 7 | `qa-f56fac15-cdc1-4d2b-9bb2-32a66810c536` |
| 34 | `GET /v1/accounts/me` | 200 | 8 | `qa-c3469463-7f38-4acd-ac32-bde6dab1ffc8` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-2e595179-6f12-44d3-b501-fe1af3264bd7` |
| 36 | `GET /v1/accounts/me` | 200 | 8 | `qa-41cb0ae0-502c-4b60-b7c4-5fbb4f8d7d16` |
| 37 | `GET /v1/accounts/me` | 200 | 11 | `qa-2c0c985d-2390-4227-878b-714d78b78b9f` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-657c8ec3-733c-4757-9d1e-d78135c3fbba` |
| 39 | `GET /v1/accounts/me` | 200 | 8 | `qa-5c351a82-cf41-4402-8d83-c4e045d393b9` |
| 40 | `GET /v1/accounts/me` | 200 | 7 | `qa-741c8423-e147-49c7-989b-5dbf39d8d1de` |
| 41 | `GET /v1/accounts/me` | 200 | 10 | `qa-1c10b55e-c587-4552-a6ef-6692578074e0` |
| 42 | `GET /v1/accounts/me` | 200 | 10 | `qa-58b1cfd7-0068-4d6f-a51e-c48bf49d9936` |
| 43 | `GET /v1/accounts/me` | 200 | 12 | `qa-4edb66e0-adf0-4649-a9bd-b282581a2b4f` |
| 44 | `GET /v1/accounts/me` | 200 | 9 | `qa-8f456eb1-3ad9-4137-a06a-5603667b5df7` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-0504f6f3-7fa8-40db-b18d-83478e2dd1d3` |
| 46 | `GET /v1/accounts/me` | 200 | 11 | `qa-d827d7e3-f57f-4b46-82ad-50a80797f07b` |
| 47 | `GET /v1/accounts/me` | 200 | 11 | `qa-a3674136-6fbf-4794-92a8-c828048f65c8` |
| 48 | `GET /v1/accounts/me` | 200 | 6 | `qa-64069ba8-c0d4-460f-8143-1150c01c6384` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-d2e61ba6-0c97-46ce-8147-9f4c8f4a60ea` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-8f2b597f-02ce-488c-b90e-1e388cfa306b` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-9a0077f7-ec41-4018-8afb-792a796e3cea` |
| 52 | `GET /v1/accounts/me` | 200 | 7 | `qa-6435f931-70d7-4f24-b4f6-8972c6538cae` |
| 53 | `GET /v1/accounts/me` | 200 | 11 | `qa-78abdfae-1605-4c29-81b0-185488198603` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-26747fb1-0372-43e8-8fda-4625c7e5c4e8` |
| 55 | `GET /v1/accounts/me` | 200 | 11 | `qa-6085ec85-54a1-4b20-8e60-5a9e6751a3c1` |
| 56 | `GET /v1/accounts/me` | 200 | 9 | `qa-07f997c7-628c-4682-adad-b65ffa326144` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-383637b8-4d61-4c25-b310-7d1ea8f4749c` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-04d81a79-3ae6-46b8-83ac-e3a71d374ae3` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-04fcbbac-4b2f-4bbe-b8e5-21b9a139c085` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-c852d54a-2848-48c7-aba9-87001b895dad` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-4921ae80-d973-4d45-9bea-6ae236111789` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-a70e33cb-5514-4732-ac3a-4906317ff417` |
| 63 | `GET /v1/accounts/me` | 429 | 7 | `qa-f25d8daf-474c-4663-bd27-c8e39ac3b604` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-cb5e7741-31e5-4ed4-a89f-c2e962e12175` |
| 65 | `GET /v1/accounts/me` | 429 | 7 | `qa-6ce9cd77-5f6a-4432-9bdd-1332ce88ca1f` |
| 66 | `GET /v1/accounts/me` | 429 | 6 | `qa-f9f8d33d-3d18-4b58-8202-fbd58a4223c5` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-890ef883-a6f0-4881-a23c-7fb3cb36a79b` |
| 68 | `GET /v1/accounts/me` | 429 | 6 | `qa-16f6c442-b690-4205-952f-6e32d92c5aa3` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-ee0a5d3f-c216-43db-8a9f-5d486685328f` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-1d281d48-530b-4c8d-beb1-97bb22527fcb` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-5cdb3ba9-4aa2-4b86-b475-0e6c7b177e94` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-f4ae19e9-a82a-4f1e-8297-6fbb37561a9f` |
| 73 | `GET /v1/accounts/me` | 429 | 6 | `qa-224ac2fc-4dda-4b18-a5db-583a20003c5b` |
| 74 | `GET /v1/accounts/me` | 429 | 5 | `qa-442bfe11-c83c-4504-89f3-66559f9b5a54` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-aab2d75c-0d36-457c-aff3-62176021be16` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-c1d93f24-3515-4e70-b1b5-1bcdb8363551` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-810f60e0-262f-4ed3-96bb-8c9986e9eab0` |
| 78 | `GET /v1/accounts/me` | 429 | 5 | `qa-a6705f09-0f4a-41a7-80da-92201c423d18` |
| 79 | `GET /v1/accounts/me` | 429 | 5 | `qa-e55c61d7-b0af-43ed-9286-b5b638c57897` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-d8b17581-81f7-483d-a426-b32a9f3635be` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-43e6d137-f1b0-4f6f-b83b-9cf4a2b63943` |
| 82 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-ed7538ec-e1c0-45b6-b7d9-f17c910bdc2c` |
| 83 | `POST /v1/auth/token` | 401 | 6 | `qa-638c880e-8031-444e-b76b-46bb47d10bc7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9a6cb2e-d1e2-4df6-a3af-3a4534896f3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9a6cb2e-d1e2-4df6-a3af-3a4534896f3c
Content-Type: application/json

--- request body ---
{"handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","password":"****","region":"eu"}

--- response: 201 in 379 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9a6cb2e-d1e2-4df6-a3af-3a4534896f3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-f7e1b91f3e48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3f74ef88-3f3d-4a32-970a-17c3a5eb231d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f74ef88-3f3d-4a32-970a-17c3a5eb231d
Content-Type: application/json

--- request body ---
{"handle":"qa-f7e1b91f3e48","password":"****"}

--- response: 200 in 54 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f74ef88-3f3d-4a32-970a-17c3a5eb231d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cac1b88-ab4f-4b65-9bba-76bea8117121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cac1b88-ab4f-4b65-9bba-76bea8117121
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cac1b88-ab4f-4b65-9bba-76bea8117121
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
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0c5f8bc-da4d-461c-a189-53fc175a7787

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c5f8bc-da4d-461c-a189-53fc175a7787
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0c5f8bc-da4d-461c-a189-53fc175a7787
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
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c78e4930-30cb-45fe-941d-3313d3487db3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c78e4930-30cb-45fe-941d-3313d3487db3
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c78e4930-30cb-45fe-941d-3313d3487db3
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
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-b922ebf6-342d-4d56-8933-ba4fe89ca199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b922ebf6-342d-4d56-8933-ba4fe89ca199
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b922ebf6-342d-4d56-8933-ba4fe89ca199
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-a66c8ac6-4eb3-4edc-b434-530b0358f9a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a66c8ac6-4eb3-4edc-b434-530b0358f9a2
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a66c8ac6-4eb3-4edc-b434-530b0358f9a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6c4504a-70bb-40a8-be49-acc779301b85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c4504a-70bb-40a8-be49-acc779301b85
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6c4504a-70bb-40a8-be49-acc779301b85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-43001731-9f20-404c-9b82-23b3cf92bec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43001731-9f20-404c-9b82-23b3cf92bec9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-43001731-9f20-404c-9b82-23b3cf92bec9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d1ba62d-36ca-4853-81c1-39512551a7d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d1ba62d-36ca-4853-81c1-39512551a7d0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d1ba62d-36ca-4853-81c1-39512551a7d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-bec1367e-a52d-475c-b075-153e12260b21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bec1367e-a52d-475c-b075-153e12260b21
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-bec1367e-a52d-475c-b075-153e12260b21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-93c9a45c-07a2-4191-90d5-2ebfa2cc71f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c9a45c-07a2-4191-90d5-2ebfa2cc71f4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-93c9a45c-07a2-4191-90d5-2ebfa2cc71f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d809974-a143-42f0-a8af-a0330d5d64eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d809974-a143-42f0-a8af-a0330d5d64eb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d809974-a143-42f0-a8af-a0330d5d64eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-b408c2fb-e6ce-4021-ae1b-75cf18603ae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b408c2fb-e6ce-4021-ae1b-75cf18603ae6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-b408c2fb-e6ce-4021-ae1b-75cf18603ae6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-24b8411b-2036-4136-a5da-a1795246d1de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24b8411b-2036-4136-a5da-a1795246d1de
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-24b8411b-2036-4136-a5da-a1795246d1de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8d83860-2864-4425-8872-262734b70964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8d83860-2864-4425-8872-262734b70964
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8d83860-2864-4425-8872-262734b70964
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-24273328-6888-4175-b50b-05dd872f9225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24273328-6888-4175-b50b-05dd872f9225
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-24273328-6888-4175-b50b-05dd872f9225
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-9373e642-16c2-4061-af2b-e727532b21f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9373e642-16c2-4061-af2b-e727532b21f6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-9373e642-16c2-4061-af2b-e727532b21f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-cab88be8-351e-4819-82bd-cd63ecd3cdcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cab88be8-351e-4819-82bd-cd63ecd3cdcd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-cab88be8-351e-4819-82bd-cd63ecd3cdcd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-18d76556-2208-4012-8825-9054cf41a935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18d76556-2208-4012-8825-9054cf41a935
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-18d76556-2208-4012-8825-9054cf41a935
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2d5de85-f444-4f1b-962a-24d76fa89eb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2d5de85-f444-4f1b-962a-24d76fa89eb9
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2d5de85-f444-4f1b-962a-24d76fa89eb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-b290461c-642d-4566-ad9d-bd55b996eaf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b290461c-642d-4566-ad9d-bd55b996eaf5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-b290461c-642d-4566-ad9d-bd55b996eaf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-a510b4c9-467e-4f06-add1-3803b1718829

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a510b4c9-467e-4f06-add1-3803b1718829
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a510b4c9-467e-4f06-add1-3803b1718829
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffaedd30-b567-47ef-9778-709ad17fdf9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffaedd30-b567-47ef-9778-709ad17fdf9f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffaedd30-b567-47ef-9778-709ad17fdf9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-40f79d30-f656-4591-ad15-7f9b5e587cca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40f79d30-f656-4591-ad15-7f9b5e587cca
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-40f79d30-f656-4591-ad15-7f9b5e587cca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-e502c13a-ac6f-4317-91b2-e45c22fd4ea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e502c13a-ac6f-4317-91b2-e45c22fd4ea9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-e502c13a-ac6f-4317-91b2-e45c22fd4ea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1a6ac26-4eef-4147-ad6d-1444bf1c354d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a6ac26-4eef-4147-ad6d-1444bf1c354d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1a6ac26-4eef-4147-ad6d-1444bf1c354d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-97d787b1-e2f9-4e2a-8479-2a940ec93906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97d787b1-e2f9-4e2a-8479-2a940ec93906
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-97d787b1-e2f9-4e2a-8479-2a940ec93906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-f81d3f6e-d41f-489a-914f-69a959e1ac09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f81d3f6e-d41f-489a-914f-69a959e1ac09
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f81d3f6e-d41f-489a-914f-69a959e1ac09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-00a4825d-98cb-4b97-be5b-99ae9924aa12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00a4825d-98cb-4b97-be5b-99ae9924aa12
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-00a4825d-98cb-4b97-be5b-99ae9924aa12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-1315bf63-e716-454a-b17b-aece4c528052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1315bf63-e716-454a-b17b-aece4c528052
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-1315bf63-e716-454a-b17b-aece4c528052
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-48812cb9-bd3d-46a5-96d3-9b914d1cae3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48812cb9-bd3d-46a5-96d3-9b914d1cae3d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-48812cb9-bd3d-46a5-96d3-9b914d1cae3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-f56fac15-cdc1-4d2b-9bb2-32a66810c536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f56fac15-cdc1-4d2b-9bb2-32a66810c536
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f56fac15-cdc1-4d2b-9bb2-32a66810c536
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3469463-7f38-4acd-ac32-bde6dab1ffc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3469463-7f38-4acd-ac32-bde6dab1ffc8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3469463-7f38-4acd-ac32-bde6dab1ffc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e595179-6f12-44d3-b501-fe1af3264bd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e595179-6f12-44d3-b501-fe1af3264bd7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e595179-6f12-44d3-b501-fe1af3264bd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-41cb0ae0-502c-4b60-b7c4-5fbb4f8d7d16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41cb0ae0-502c-4b60-b7c4-5fbb4f8d7d16
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-41cb0ae0-502c-4b60-b7c4-5fbb4f8d7d16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c0c985d-2390-4227-878b-714d78b78b9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c0c985d-2390-4227-878b-714d78b78b9f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c0c985d-2390-4227-878b-714d78b78b9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-657c8ec3-733c-4757-9d1e-d78135c3fbba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-657c8ec3-733c-4757-9d1e-d78135c3fbba
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-657c8ec3-733c-4757-9d1e-d78135c3fbba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c351a82-cf41-4402-8d83-c4e045d393b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c351a82-cf41-4402-8d83-c4e045d393b9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c351a82-cf41-4402-8d83-c4e045d393b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-741c8423-e147-49c7-989b-5dbf39d8d1de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-741c8423-e147-49c7-989b-5dbf39d8d1de
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-741c8423-e147-49c7-989b-5dbf39d8d1de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c10b55e-c587-4552-a6ef-6692578074e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c10b55e-c587-4552-a6ef-6692578074e0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c10b55e-c587-4552-a6ef-6692578074e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-58b1cfd7-0068-4d6f-a51e-c48bf49d9936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b1cfd7-0068-4d6f-a51e-c48bf49d9936
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-58b1cfd7-0068-4d6f-a51e-c48bf49d9936
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-4edb66e0-adf0-4649-a9bd-b282581a2b4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4edb66e0-adf0-4649-a9bd-b282581a2b4f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-4edb66e0-adf0-4649-a9bd-b282581a2b4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f456eb1-3ad9-4137-a06a-5603667b5df7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f456eb1-3ad9-4137-a06a-5603667b5df7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f456eb1-3ad9-4137-a06a-5603667b5df7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-0504f6f3-7fa8-40db-b18d-83478e2dd1d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0504f6f3-7fa8-40db-b18d-83478e2dd1d3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-0504f6f3-7fa8-40db-b18d-83478e2dd1d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-d827d7e3-f57f-4b46-82ad-50a80797f07b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d827d7e3-f57f-4b46-82ad-50a80797f07b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-d827d7e3-f57f-4b46-82ad-50a80797f07b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3674136-6fbf-4794-92a8-c828048f65c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3674136-6fbf-4794-92a8-c828048f65c8
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3674136-6fbf-4794-92a8-c828048f65c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-64069ba8-c0d4-460f-8143-1150c01c6384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64069ba8-c0d4-460f-8143-1150c01c6384
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-64069ba8-c0d4-460f-8143-1150c01c6384
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2e61ba6-0c97-46ce-8147-9f4c8f4a60ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2e61ba6-0c97-46ce-8147-9f4c8f4a60ea
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2e61ba6-0c97-46ce-8147-9f4c8f4a60ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f2b597f-02ce-488c-b90e-1e388cfa306b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2b597f-02ce-488c-b90e-1e388cfa306b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2b597f-02ce-488c-b90e-1e388cfa306b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a0077f7-ec41-4018-8afb-792a796e3cea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a0077f7-ec41-4018-8afb-792a796e3cea
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a0077f7-ec41-4018-8afb-792a796e3cea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-6435f931-70d7-4f24-b4f6-8972c6538cae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6435f931-70d7-4f24-b4f6-8972c6538cae
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-6435f931-70d7-4f24-b4f6-8972c6538cae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-78abdfae-1605-4c29-81b0-185488198603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78abdfae-1605-4c29-81b0-185488198603
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-78abdfae-1605-4c29-81b0-185488198603
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-26747fb1-0372-43e8-8fda-4625c7e5c4e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26747fb1-0372-43e8-8fda-4625c7e5c4e8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-26747fb1-0372-43e8-8fda-4625c7e5c4e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-6085ec85-54a1-4b20-8e60-5a9e6751a3c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6085ec85-54a1-4b20-8e60-5a9e6751a3c1
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-6085ec85-54a1-4b20-8e60-5a9e6751a3c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-07f997c7-628c-4682-adad-b65ffa326144

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07f997c7-628c-4682-adad-b65ffa326144
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-07f997c7-628c-4682-adad-b65ffa326144
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-383637b8-4d61-4c25-b310-7d1ea8f4749c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-383637b8-4d61-4c25-b310-7d1ea8f4749c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-383637b8-4d61-4c25-b310-7d1ea8f4749c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-04d81a79-3ae6-46b8-83ac-e3a71d374ae3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d81a79-3ae6-46b8-83ac-e3a71d374ae3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d81a79-3ae6-46b8-83ac-e3a71d374ae3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-04fcbbac-4b2f-4bbe-b8e5-21b9a139c085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04fcbbac-4b2f-4bbe-b8e5-21b9a139c085
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-04fcbbac-4b2f-4bbe-b8e5-21b9a139c085
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-c852d54a-2848-48c7-aba9-87001b895dad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c852d54a-2848-48c7-aba9-87001b895dad
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c852d54a-2848-48c7-aba9-87001b895dad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-4921ae80-d973-4d45-9bea-6ae236111789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4921ae80-d973-4d45-9bea-6ae236111789
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-4921ae80-d973-4d45-9bea-6ae236111789
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-a70e33cb-5514-4732-ac3a-4906317ff417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a70e33cb-5514-4732-ac3a-4906317ff417
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a70e33cb-5514-4732-ac3a-4906317ff417
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-f25d8daf-474c-4663-bd27-c8e39ac3b604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f25d8daf-474c-4663-bd27-c8e39ac3b604
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f25d8daf-474c-4663-bd27-c8e39ac3b604
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f25d8daf-474c-4663-bd27-c8e39ac3b604"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb5e7741-31e5-4ed4-a89f-c2e962e12175

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb5e7741-31e5-4ed4-a89f-c2e962e12175
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb5e7741-31e5-4ed4-a89f-c2e962e12175
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cb5e7741-31e5-4ed4-a89f-c2e962e12175"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ce9cd77-5f6a-4432-9bdd-1332ce88ca1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce9cd77-5f6a-4432-9bdd-1332ce88ca1f
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ce9cd77-5f6a-4432-9bdd-1332ce88ca1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ce9cd77-5f6a-4432-9bdd-1332ce88ca1f"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9f8d33d-3d18-4b58-8202-fbd58a4223c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9f8d33d-3d18-4b58-8202-fbd58a4223c5
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9f8d33d-3d18-4b58-8202-fbd58a4223c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f9f8d33d-3d18-4b58-8202-fbd58a4223c5"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-890ef883-a6f0-4881-a23c-7fb3cb36a79b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-890ef883-a6f0-4881-a23c-7fb3cb36a79b
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-890ef883-a6f0-4881-a23c-7fb3cb36a79b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-890ef883-a6f0-4881-a23c-7fb3cb36a79b"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-16f6c442-b690-4205-952f-6e32d92c5aa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f6c442-b690-4205-952f-6e32d92c5aa3
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16f6c442-b690-4205-952f-6e32d92c5aa3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-16f6c442-b690-4205-952f-6e32d92c5aa3"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee0a5d3f-c216-43db-8a9f-5d486685328f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee0a5d3f-c216-43db-8a9f-5d486685328f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee0a5d3f-c216-43db-8a9f-5d486685328f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ee0a5d3f-c216-43db-8a9f-5d486685328f"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d281d48-530b-4c8d-beb1-97bb22527fcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d281d48-530b-4c8d-beb1-97bb22527fcb
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d281d48-530b-4c8d-beb1-97bb22527fcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1d281d48-530b-4c8d-beb1-97bb22527fcb"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-5cdb3ba9-4aa2-4b86-b475-0e6c7b177e94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cdb3ba9-4aa2-4b86-b475-0e6c7b177e94
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cdb3ba9-4aa2-4b86-b475-0e6c7b177e94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5cdb3ba9-4aa2-4b86-b475-0e6c7b177e94"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4ae19e9-a82a-4f1e-8297-6fbb37561a9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ae19e9-a82a-4f1e-8297-6fbb37561a9f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4ae19e9-a82a-4f1e-8297-6fbb37561a9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f4ae19e9-a82a-4f1e-8297-6fbb37561a9f"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-224ac2fc-4dda-4b18-a5db-583a20003c5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-224ac2fc-4dda-4b18-a5db-583a20003c5b
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-224ac2fc-4dda-4b18-a5db-583a20003c5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-224ac2fc-4dda-4b18-a5db-583a20003c5b"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-442bfe11-c83c-4504-89f3-66559f9b5a54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-442bfe11-c83c-4504-89f3-66559f9b5a54
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-442bfe11-c83c-4504-89f3-66559f9b5a54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-442bfe11-c83c-4504-89f3-66559f9b5a54"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-aab2d75c-0d36-457c-aff3-62176021be16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aab2d75c-0d36-457c-aff3-62176021be16
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aab2d75c-0d36-457c-aff3-62176021be16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-aab2d75c-0d36-457c-aff3-62176021be16"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-c1d93f24-3515-4e70-b1b5-1bcdb8363551

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1d93f24-3515-4e70-b1b5-1bcdb8363551
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1d93f24-3515-4e70-b1b5-1bcdb8363551
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c1d93f24-3515-4e70-b1b5-1bcdb8363551"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-810f60e0-262f-4ed3-96bb-8c9986e9eab0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-810f60e0-262f-4ed3-96bb-8c9986e9eab0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-810f60e0-262f-4ed3-96bb-8c9986e9eab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-810f60e0-262f-4ed3-96bb-8c9986e9eab0"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6705f09-0f4a-41a7-80da-92201c423d18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6705f09-0f4a-41a7-80da-92201c423d18
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6705f09-0f4a-41a7-80da-92201c423d18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a6705f09-0f4a-41a7-80da-92201c423d18"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-e55c61d7-b0af-43ed-9286-b5b638c57897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e55c61d7-b0af-43ed-9286-b5b638c57897
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e55c61d7-b0af-43ed-9286-b5b638c57897
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e55c61d7-b0af-43ed-9286-b5b638c57897"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8b17581-81f7-483d-a426-b32a9f3635be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b17581-81f7-483d-a426-b32a9f3635be
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8b17581-81f7-483d-a426-b32a9f3635be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d8b17581-81f7-483d-a426-b32a9f3635be"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-43e6d137-f1b0-4f6f-b83b-9cf4a2b63943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43e6d137-f1b0-4f6f-b83b-9cf4a2b63943
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-43e6d137-f1b0-4f6f-b83b-9cf4a2b63943
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
Content-Length: 181

{"id":"acc_a8784c06-5614-4e49-b2f2-ec459e10cff6","handle":"qa-f7e1b91f3e48","displayName":"QA f7e1b91f3e48","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.243024382Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed7538ec-e1c0-45b6-b7d9-f17c910bdc2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed7538ec-e1c0-45b6-b7d9-f17c910bdc2c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed7538ec-e1c0-45b6-b7d9-f17c910bdc2c
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-638c880e-8031-444e-b76b-46bb47d10bc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-638c880e-8031-444e-b76b-46bb47d10bc7
Content-Type: application/json

--- request body ---
{"handle":"qa-f7e1b91f3e48","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-638c880e-8031-444e-b76b-46bb47d10bc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-638c880e-8031-444e-b76b-46bb47d10bc7"}
```
